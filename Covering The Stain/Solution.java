import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Solution {
  private static Reader in;
  private static PrintWriter out;
  public static long mod = 1000000007;
  public static long mod_exp(long b, long e) {
    long r = 1;
    while (e > 0) {
      if ((e & 1) == 1) r = (r * b) % mod;
      b = (b * b) % mod;
      e >>= 1;
    }
    return r;
  }
  
  public static long[] fact, invfact;
  
  public static void main(String[] args) throws IOException {
    in = new Reader();
    out = new PrintWriter(System.out, true);
    
    fact = new long[1001];
    invfact = new long[1001];
    fact[0] = 1;
    invfact[0] = 1;
    for (int i = 1; i <= 1000; i++) {
      fact[i] = (i * fact[i - 1]) % mod;
      invfact[i] = mod_exp(fact[i], mod - 2);
    }
    
    int sx = 1 << 29, sy = 1 << 29, ex = -1, ey = -1;
    int N = in.nextInt(), K = in.nextInt();
    int[][] p = new int[N][2];
    for (int i = 0; i < N; i++) {
      p[i] = new int[2];
      p[i][0] = in.nextInt();
      p[i][1] = in.nextInt();
      if (p[i][0] < sx) sx = p[i][0];
      if (p[i][0] > ex) ex = p[i][0];
      if (p[i][1] < sy) sy = p[i][1];
      if (p[i][1] > ey) ey = p[i][1];
    }
    int[] b = new int[] {sx, ex, sy, ey};
    int[] id = new int[] {0, 0, 1, 1};
    long total = 0;
    for (int mask = 1; mask < 1 << 4; mask++) {
      
      int count = 0;
      for (int i = 0; i < N; i++) {
        boolean ok = false;
        for (int j = 0; j < 4; j++) {
          if (set(mask, j) && p[i][id[j]] == b[j])
            ok = true;
        }
        if (ok) count++;
      }
      long sgn = Integer.bitCount(mask) % 2 == 1 ? 1 : (mod - 1);
      total = (total + sgn * binom(N - count, K - count)) % mod;
    }
    
    out.println(total);
    out.close();
    System.exit(0);
  }
  
  public static boolean set(int m, int i) {
    return ((m >> i) & 1) == 1;
  }
  
  public static long binom(int N, int K) {
    if (K < 0 || K > N) return 0;
    return fact[N] * invfact[K] % mod * invfact[N - K] % mod;
  }

  static class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader() {
      din = new DataInputStream(System.in);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException {
      din = new DataInputStream(new FileInputStream(file_name));
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException {
      byte[] buf = new byte[1024];
      int cnt = 0, c;
      while ((c = read()) != -1) {
        if (c == '\n')
          break;
        buf[cnt++] = (byte) c;
      }
      return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException {
      int ret = 0;
      byte c = read();
      while (c <= ' ')
        c = read();
      boolean neg = (c == '-');
      if (neg)
        c = read();
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');
      if (neg)
        return -ret;
      return ret;
    }

    public long nextLong() throws IOException {
      long ret = 0;
      byte c = read();
      while (c <= ' ')
        c = read();
      boolean neg = (c == '-');
      if (neg)
        c = read();
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');
      if (neg)
        return -ret;
      return ret;
    }

    public double nextDouble() throws IOException {
      double ret = 0, div = 1;
      byte c = read();
      while (c <= ' ')
        c = read();
      boolean neg = (c == '-');
      if (neg)
        c = read();
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');
      if (c == '.')
        while ((c = read()) >= '0' && c <= '9')
          ret += (c - '0') / (div *= 10);
      if (neg)
        return -ret;
      return ret;
    }

    private void fillBuffer() throws IOException {
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      if (bytesRead == -1)
        buffer[0] = -1;
    }

    private byte read() throws IOException {
      if (bufferPointer == bytesRead)
        fillBuffer();
      return buffer[bufferPointer++];
    }

    public void close() throws IOException {
      if (din == null)
        return;
      din.close();
    }
  }

}

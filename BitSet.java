import java.util.Arrays;

public class BitSet{
    char ar[];
    int len;
    public BitSet(int size) {
       len=size;
       ar=new char[size];
       for(int i=0;i<size;i++)
       {
           ar[i]='0';
       }
    }
    public void fix(int idx) {
        ar[idx]='1';
    }

    public void unfix(int idx) {
        ar[idx]='0';
    }

    public void flip() {
          for(int i=0;i<len;i++)
          {
              if(ar[i]=='0')
              {
                  ar[i]='1';
              }
              else
              {
                  ar[i]='0';
              }
          }
    }

    public boolean all() {
        for(int i=0;i<len;i++)
        {
            if(ar[i]=='0')
            {
                return false;
            }
        }
        return true;
    }

    public boolean one() {
        for(int i=0;i<len;i++) {
            if (ar[i] == '1') {
                return true;
            }
        }
        return false;
    }

    public int count() {
        int c=0;
        for(int i=0;i<len;i++) {
            if (ar[i] == '1') {
                c++;
            }
        }
        return c;
    }

    public String toString() {
          String res="";
          for(int i=0;i<len;i++)
          {
              res=res+ar[i];
          }
          return res;
    }
    public static void main(String args[])
    {
        BitSet bs = new BitSet(5);
        bs.fix(3);     // the value at idx = 3 is updated to 1, so bitset = "00010".
        bs.fix(1);     // the value at idx = 1 is updated to 1, so bitset = "01010".
        bs.flip();     // the value of each bit is flipped, so bitset = "10101".
        bs.all();      // return False, as not all values of the bitset are 1.
        bs.unfix(0);   // the value at idx = 0 is updated to 0, so bitset = "00101".
        bs.flip();     // the value of each bit is flipped, so bitset = "11010".
        bs.one();      // return True, as there is at least 1 index with value 1.
        bs.unfix(0);   // the value at idx = 0 is updated to 0, so bitset = "01010".
        bs.count();    // return 2, as there are 2 bits with value 1.
        System.out.println(bs.toString());
    }
}

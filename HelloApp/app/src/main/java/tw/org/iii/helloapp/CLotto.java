package tw.org.iii.helloapp;

/**
 * Created by iii on 2017/7/12.
 */

public class CLotto {

     public String GetNumbers(int p_intCount, int p_intMin, int p_intMax) {
//(取N個，最小值，最大值)

        String l_strNumbers = "";
        int l_intCount = 0;
        int[] l_intNumbers = new int[p_intCount];

        while (l_intCount < p_intCount) {
            double d = 100 * Math.random();
            int l_intTemp = (int) d;
            if (l_intTemp >= p_intMin && l_intTemp <= p_intMax) {
                if (!IfExist(l_intTemp, l_intNumbers)) {
                    l_intNumbers[l_intCount] = l_intTemp;
                    l_intCount++;
                }
            }
        }

        for (int i = 0; i < l_intNumbers.length; i++) {
            for (int j = 0; j < l_intNumbers.length - 1; j++) {
                if (l_intNumbers[j] > l_intNumbers[j + 1]) {
                    int l_intMax = l_intNumbers[j];
                    l_intNumbers[j] = l_intNumbers[j + 1];
                    l_intNumbers[j + 1] = l_intMax;
                }
            }
        }

        for (int i = 0; i < l_intNumbers.length; i++)
            l_strNumbers += String.valueOf(l_intNumbers[i]) + " ";

        return l_strNumbers;
    }

  static   public boolean IfExist(int p_intTarget, int[] p_intNumbers) {

        for (int i = 0; i < p_intNumbers.length; i++) {
            if (p_intTarget == p_intNumbers[i]) {
                return true;
            }
        }
        return false;
    }
}

package Project5;

public class MoonSamples {
    public static void main(String[] args) {
        /**************************************
         * Setting the variables for the elements and values
         ***************************************/
        String soilElements = "carbon-dioxide, magnesium,sodium, potassium, chloride, water";
        String soilValue = "8.3, 4.5, 6.7, 2.3, 12.5, 4.5 <> 3.9, 1.8, 34.7, 23.5, 1.2, 14.3 <> 6.7, 7.4, 1.5, 18.4, 7.2, 23.7 <> 23.4, 5.6, 2.9, 18.5, 39.5, 18.2 <> 15.4, 5.3, 27.4, 9.8, 3.8, 27.4";
        String[] elementArray = getElements(soilElements);
        double[][] valueArray = getSamples(soilValue);
        int num = 1;
        int[] var = searchForLife(valueArray);
        /**************************************
         * Outputting the answers
         ***************************************/
        System.out.print("The sample that contain life are: ");
        for (int i = 0; i < var.length; i++) {
            System.out.print(var[i] + " ");
        }
        System.out.println("The highest elements for sample 1 are " + searchHighestElements(valueArray, elementArray, num));
        System.out.println("The sample with the highest value of the element water is " + searchHighestSample(valueArray, elementArray, soilElements));
    }

    /**************************************
     * Creates the array with elements
     ***************************************/
    public static String[] getElements (String inputElementString) {
        String[] eStr = inputElementString.split(",");
        return eStr;
    }

    /**************************************
     * Creates multi array with values
     ***************************************/
    public static double[][] getSamples (String inputSamplesString) {
        String[] aStr = inputSamplesString.split("<>");
        String[] rStr = aStr[0].split(",");
        double[][] vStr = new double[aStr.length][rStr.length];
        int i = 0;
        while (i < aStr.length) {
            rStr = aStr[i].split(",");
            int x = 0;
            while (x < rStr.length) {
                vStr[i][x] = Double.parseDouble(rStr[x]);
                x++;
            }
            i++;
        }
        return vStr;
    }

    /**************************************
     * Determines the samples that can search for life
     ***************************************/
    public static int[] searchForLife(double [][] samples) {
        double[] critValue = new double[samples.length];
        int c = 0;
        int i = 0;
        while (i < samples.length) {
            double value = (8 * samples[i][0]) + (2 * samples[i][1]) + samples[i][2] + (4 * samples[i][3]) + samples[i][4] + (5 * samples[i][5]);
            critValue[i] = value;
            if (value >= 350) {
                c++;
            }
            i++;
        }
        int[] r = new int[c];
        int boop = 0;
        int x = 0;
        while (x < critValue.length) {
            if (critValue[x] >= 350) {
                r[boop++] = (x + 1);
            }
            x++;
        }
        return r;
    }

    /**************************************
     * Returns thw two elements with the highest value
     ***************************************/
    public static String searchHighestElements(double [][] samples, String[] elements, int sampleNum) {
        double value = -1;
        int num1 = -1;
        int num2 = -1;
        int i = 0;
        while (i < samples[sampleNum - 1].length) {
            if (samples[sampleNum - 1][i] > value) {
                num2 = i + 2;
                value = samples[sampleNum - 1][i];
                num1 = i;
            }
            i++;
        }
        return elements[num1] + " and " + elements[num2];
    }

    /**************************************
     * Return highest element value in given arrays
     ***************************************/
    public static int searchHighestSample(double [][] samples, String[] elements, String element) {
        double m = -1;
        int n = 0;
        int v = 0;
        int i = 0;
        while (i < elements.length) {
            if(element.equals(elements[i])) {
                n = i;
            }
            i++;
        }
        int x = 0;
        while (x < samples.length) {
            if (m < samples[x][n]) {
                m = samples[x][n];
                v = x + 1;
            }
            x++;
        }
        return v;
    }
}

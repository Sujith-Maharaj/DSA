class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        double kel = 0;
        double far = 0;
        kel = celsius + 273.15;
        far = celsius *1.80 + 32.00;

        ans[0] = kel;
        ans[1] = far;

        return ans;
    }
}
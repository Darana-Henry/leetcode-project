//https://leetcode.com/problems/convert-the-temperature/
package algorithms.easy.c;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        ConvertTheTemperature temperature = new ConvertTheTemperature();
        System.out.println("Output:\t" + temperature.convertTemperature(36.50));
        System.out.println("Output:\t" + temperature.convertTemperature(122.11));
    }

    public double[] convertTemperature(double celsius) {
        double[] answer = new double[2];
        answer[0] = celsius + 273.15;
        answer[1] = celsius * 1.8 + 32;
        return answer;
    }
}

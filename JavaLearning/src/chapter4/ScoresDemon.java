package chapter4;

public class ScoresDemon {
    // 6名评委打分，分数存在数组 去掉最高最低分， 求平均分
    public static void main(String[] args) {
        double[] sco1 = {90.2, 54.9, 78.7, 90.3};
        System.out.println(scores(sco1));
    }

    // 函数实现评委功能
    public static double scores(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = max > arr[i] ? max : arr[i];
            min = min < arr[i] ? min : arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        double res = (sum - max - min) / (arr.length - 2);
        return res;
    }
}

package mapdemo1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
        需求：
            某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是（A，B，C，D），
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人最多
        */

        // 1. 准备数据：创建80名学生，随机选择景点
        String[] spots = {"A", "B", "C", "D"};
        List<Students> studentList = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 80; i++) {
            String choice = spots[random.nextInt(spots.length)];
            Students student = new Students("学生" + i, choice);
            studentList.add(student);
        }

        // 2. 使用Map统计每个景点的选择人数
        Map<String, Integer> spotCount = new HashMap<>();

        // 初始化Map，所有景点计数为0
        for (String spot : spots) {
            spotCount.put(spot, 0);
        }

        // 遍历学生列表，统计每个景点的人数
        for (Students student : studentList) {
            String choice = student.getChoice();
            spotCount.put(choice, spotCount.get(choice) + 1);
        }

        // 3. 输出统计结果
        System.out.println("=== 景点选择统计结果 ===");
        for (Map.Entry<String, Integer> entry : spotCount.entrySet()) {
            System.out.println("景点" + entry.getKey() + ": " + entry.getValue() + "人");
        }

        // 4. 找出最受欢迎的景点
        String mostPopularSpot = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : spotCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularSpot = entry.getKey();
            }
        }

        System.out.println("\n=== 最终结果 ===");
        System.out.println("最受欢迎的景点是：景点" + mostPopularSpot);
        System.out.println("选择人数：" + maxCount + "人");
    }
}

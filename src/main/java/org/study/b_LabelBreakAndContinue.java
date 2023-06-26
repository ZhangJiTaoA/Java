package org.study;

/*
    带标签的break和continue主要用于多层嵌套循环，能够直接跳出多层循环
 */
public class b_LabelBreakAndContinue {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        b_LabelBreakAndContinue bLabelBreakAndContinue = new b_LabelBreakAndContinue();

        outer1:  // 用于表示以下的一个两层嵌套循环
        for (int i = 0; i < 8; i++) {
            for (int j = 0; i < 8; j++) {
                System.out.println(bLabelBreakAndContinue.arr[j]);
                if(bLabelBreakAndContinue.arr[j]==4){
                    break outer1;   // 加了标签的break可以直接跳出两层循环
                }
                System.out.println("第二层循环：" + j);
            }
            System.out.println("第一层循环：" + i);
        }
        outer2:
        for (int i = 0; i < 8; i++) {
            System.out.println("第一层循环：" + i);
            for (int j = 0; i < 8; j++) {
                System.out.println(bLabelBreakAndContinue.arr[j]);
                if(bLabelBreakAndContinue.arr[j]==4){
                    continue outer2;   // 加了标签的continue从外层循环继续
                }
                System.out.println("第二层循环：" + j);
            }
        }
    }
}

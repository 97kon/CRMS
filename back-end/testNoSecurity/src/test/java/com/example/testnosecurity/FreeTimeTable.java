package com.example.testnosecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FreeTimeTable {

    @Test
    public  void TestMain(){
        String string1 = "[[1,1,1,1,0],[0,0,0,1,1],[0,0,1,1,1],[1,1,0,0,1],[0,0,1,1,1]]";
        String string2 = "[[2,2,0,0,0],[0,2,0,2,2],[2,0,0,0,2],[2,2,0,0,2],[0,2,0,0,0]]";
        String string3 = "[[3,0,0,3,0],[3,0,0,3,0],[0,0,3,0,0],[3,0,3,0,0],[0,3,0,3,0]]";

        // 将字符串转化为二维数组
        int[][] table1 = parseString(string1);
        int[][] table2 = parseString(string2);
        int[][] table3 = parseString(string3);

        // 将三个二维数组合并
        int[][] freeTable = mergeTables(table1, table2, table3);

        // 打印合并后的空闲时间表
        printTable(freeTable);
    }

    // 辅助函数，将字符串转化为二维数组
    private static int[][] parseString(String s) {
        s = s.replaceAll("\\[|\\]", ""); // 将“[”和“]”全部替换为“”
        String[] rows = s.split("],");
        int[][] table = new int[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            String row = rows[i];
            String[] values = row.split(",");
            table[i] = new int[values.length];
            for (int j = 0; j < values.length; j++) {
                table[i][j] = Integer.parseInt(values[j]);
            }
        }
        return table;
    }

    private static int[][] mergeTables(int[][] table1, int[][] table2, int[][] table3) {
        int[][] result = new int[table1.length][table1[0].length];
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1[i].length; j++) {
                int value = 0;
                if (table1[i][j] == 1) {
                    value = 1;
                } else if (table2[i][j] == 2) {
                    value = 2;
                } else if (table3[i][j] == 3) {
                    value = 3;
                }
                result[i][j] = value;
            }
        }
        return result;
    }

    private static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println("huanhang");
        }
    }

    }

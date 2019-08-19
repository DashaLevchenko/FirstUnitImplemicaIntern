import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.Integer.*;
import static org.junit.jupiter.api.Assertions.*;

class Task2HouseTest {
    private final int MAX_LEGAL_ARGUMENT = MAX_VALUE; //2147483647
    private final int MIN_LEGAL_ARGUMENT = 1;

    private final int MAX_MINUS = MAX_LEGAL_ARGUMENT - 1; //2147483646
    private final int MIN_PLUS = MIN_VALUE + 1; //-2147483647

    private final int MAX_HALF = MAX_LEGAL_ARGUMENT / 2; //1073741823
    private final int MIN_HALF = MIN_VALUE / 2; //-1073741824

    private final int MAX_HALF_MINUS = MAX_HALF - 1; //1073741822
    private final int MIN_HALF_MINUS = MIN_HALF - 1; //-1073741825

    private final int MAX_HALF_PLUS = MAX_HALF + 1; //1073741824
    private final int MIN_HALF_PLUS = MIN_HALF + 1; //-1073741823


    @Test
    void findFloorEntranceValid() {
        //The first two arguments fixed
        //Entrances 1-10 (1 x 1)
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 1, 1);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 2, 1, 2);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 3, 1, 3);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 4, 1, 4);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 5, 1, 5);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 6, 1, 6);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 7, 1, 7);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 8, 1, 8);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 9, 1, 9);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 10, 1, 10);
        //Entrances 11-20 (1 x 1)
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 11, 1, 11);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 12, 1, 12);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 13, 1, 13);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 14, 1, 14);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 15, 1, 15);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 16, 1, 16);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 17, 1, 17);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 18, 1, 18);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 19, 1, 19);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 20, 1, 20);
        //Entrances 21-30 (1 x 1)
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 21, 1, 21);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 22, 1, 22);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 23, 1, 23);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 24, 1, 24);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 25, 1, 25);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 26, 1, 26);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 27, 1, 27);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 28, 1, 28);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 29, 1, 29);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 30, 1, 30);
        //Entrances 31-40 (1 x 1)
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 31, 1, 31);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 32, 1, 32);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 33, 1, 33);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 34, 1, 34);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 35, 1, 35);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 36, 1, 36);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 37, 1, 37);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 38, 1, 38);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 39, 1, 39);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 40, 1, 40);
        //Entrances 41-50 (1 x 1)
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 41, 1, 41);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 42, 1, 42);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 43, 1, 43);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 44, 1, 44);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 45, 1, 45);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 46, 1, 46);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 47, 1, 47);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 48, 1, 48);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 49, 1, 49);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 50, 1, 50);
        //Entrances 51-60 (1 x 1)
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 51, 1, 51);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 52, 1, 52);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 53, 1, 53);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 54, 1, 54);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 55, 1, 55);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 56, 1, 56);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 57, 1, 57);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 58, 1, 58);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 59, 1, 59);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, 60, 1, 60);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_HALF_MINUS, 1, MAX_HALF_MINUS);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_HALF, 1, MAX_HALF);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_HALF_PLUS, 1, MAX_HALF_PLUS);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_MINUS, 1, MAX_MINUS);
        assertionsValid(MIN_LEGAL_ARGUMENT, MIN_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1, MAX_LEGAL_ARGUMENT);

        //House with 2 floors with 2 apartments per floor
        //1-th entrance (2 x 2)
        assertionsValid(2, 2, 1, 1, 1);
        assertionsValid(2, 2, 2, 1, 1);
        assertionsValid(2, 2, 4, 2, 1);
        //2-th entrance (2 x 2)
        assertionsValid(2, 2, 5, 1, 2);
        assertionsValid(2, 2, 8, 2, 2);
        //3-th entrance (2 x 2)
        assertionsValid(2, 2, 9, 1, 3);
        assertionsValid(2, 2, 12, 2, 3);
        //4-th entrance (2 x 2)
        assertionsValid(2, 2, 13, 1, 4);
        assertionsValid(2, 2, 16, 2, 4);
        //5-th entrance (2 x 2)
        assertionsValid(2, 2, 17, 1, 5);
        assertionsValid(2, 2, 20, 2, 5);
        //6-th entrance (2 x 2)
        assertionsValid(2, 2, 21, 1, 6);
        assertionsValid(2, 2, 24, 2, 6);
        //7-th entrance (2 x 2)
        assertionsValid(2, 2, 25, 1, 7);
        assertionsValid(2, 2, 28, 2, 7);
        //8-th entrance (2 x 2)
        assertionsValid(2, 2, 29, 1, 8);
        assertionsValid(2, 2, 32, 2, 8);
        //9-th entrance (2 x 2)
        assertionsValid(2, 2, 33, 1, 9);
        assertionsValid(2, 2, 36, 2, 9);
        //10-th entrance (2 x 2)
        assertionsValid(2, 2, 37, 1, 10);
        assertionsValid(2, 2, 40, 2, 10);
        //11-th entrance (2 x 2)
        assertionsValid(2, 2, 41, 1, 11);
        assertionsValid(2, 2, 44, 2, 11);
        //12-th entrance (2 x 2)
        assertionsValid(2, 2, 45, 1, 12);
        assertionsValid(2, 2, 48, 2, 12);
        //13-th entrance (2 x 2)
        assertionsValid(2, 2, 49, 1, 13);
        assertionsValid(2, 2, 52, 2, 13);
        //14-th entrance (2 x 2)
        assertionsValid(2, 2, 53, 1, 14);
        assertionsValid(2, 2, 56, 2, 14);
        //15-th entrance (2 x 2)
        assertionsValid(2, 2, 57, 1, 15);
        assertionsValid(2, 2, 60, 2, 15);
        //16-th entrance (2 x 2)
        assertionsValid(2, 2, 61, 1, 16);
        assertionsValid(2, 2, 64, 2, 16);
        //17-th entrance (2 x 2)
        assertionsValid(2, 2, 65, 1, 17);
        assertionsValid(2, 2, 68, 2, 17);
        //18-th entrance (2 x 2)
        assertionsValid(2, 2, 69, 1, 18);
        assertionsValid(2, 2, 72, 2, 18);
        //19-th entrance (2 x 2)
        assertionsValid(2, 2, 73, 1, 19);
        assertionsValid(2, 2, 76, 2, 19);
        //20-th entrance (2 x 2)
        assertionsValid(2, 2, 77, 1, 20);
        assertionsValid(2, 2, 80, 2, 20);
        //21-th entrance (2 x 2)
        assertionsValid(2, 2, 81, 1, 21);
        assertionsValid(2, 2, 84, 2, 21);
        //22-th entrance (2 x 2)
        assertionsValid(2, 2, 85, 1, 22);
        assertionsValid(2, 2, 88, 2, 22);
        //23-th entrance (2 x 2)
        assertionsValid(2, 2, 89, 1, 23);
        assertionsValid(2, 2, 92, 2, 23);
        //24-th entrance (2 x 2)
        assertionsValid(2, 2, 93, 1, 24);
        assertionsValid(2, 2, 96, 2, 24);
        //25-th entrance (2 x 2)
        assertionsValid(2, 2, 97, 1, 25);
        assertionsValid(2, 2, 100, 2, 25);
        //26-th entrance (2 x 2)
        assertionsValid(2, 2, 101, 1, 26);
        assertionsValid(2, 2, 104, 2, 26);
        //27-th entrance (2 x 2)
        assertionsValid(2, 2, 105, 1, 27);
        assertionsValid(2, 2, 108, 2, 27);
        //28-th entrance (2 x 2)
        assertionsValid(2, 2, 109, 1, 28);
        assertionsValid(2, 2, 112, 2, 28);
        //29-th entrance (2 x 2)
        assertionsValid(2, 2, 113, 1, 29);
        assertionsValid(2, 2, 116, 2, 29);
        //30-th entrance (2 x 2)
        assertionsValid(2, 2, 117, 1, 30);
        assertionsValid(2, 2, 120, 2, 30);
        //268_435_456-th entrance
        assertionsValid(2, 2, MAX_HALF_MINUS, 1, MAX_HALF / 4 + 1);
        assertionsValid(2, 2, MAX_HALF, 2, MAX_HALF / 4 + 1);
        assertionsValid(2, 2, MAX_HALF_PLUS, 2, MAX_HALF / 4 + 1);
        //536_870_912-th entrance
        assertionsValid(2, 2, MAX_MINUS, 1, MAX_LEGAL_ARGUMENT / 4 + 1);
        assertionsValid(2, 2, MAX_LEGAL_ARGUMENT, 2, MAX_LEGAL_ARGUMENT / 4 + 1);

        //House with 5 floors with 3 apartments per floor
        // 1 floor, 1 entrance (5х3)
        assertionsValid(5, 3, 1, 1, 1);
        assertionsValid(5, 3, 3, 1, 1);
        // 2 floor, 1 entrance (5х3)
        assertionsValid(5, 3, 4, 2, 1);
        assertionsValid(5, 3, 6, 2, 1);
        // 3 floor, 1 entrance (5х3)
        assertionsValid(5, 3, 7, 3, 1);
        assertionsValid(5, 3, 9, 3, 1);
        // 4 floor, 1 entrance (5х3)
        assertionsValid(5, 3, 10, 4, 1);
        assertionsValid(5, 3, 12, 4, 1);
        // 5 floor, 1 entrance (5х3)
        assertionsValid(5, 3, 13, 5, 1);
        assertionsValid(5, 3, 15, 5, 1);
        //2-th entrance
        // 1 floor, 2 entrance (5х3)
        assertionsValid(5, 3, 16, 1, 2);
        assertionsValid(5, 3, 18, 1, 2);
        // 2 floor, 2 entrance (5х3)
        assertionsValid(5, 3, 19, 2, 2);
        assertionsValid(5, 3, 21, 2, 2);
        // 3 floor, 2 entrance (5х3)
        assertionsValid(5, 3, 22, 3, 2);
        assertionsValid(5, 3, 24, 3, 2);
        // 4 floor, 2 entrance (5х3)
        assertionsValid(5, 3, 25, 4, 2);
        assertionsValid(5, 3, 27, 4, 2);
        // 5 floor, 2 entrance (5х3)
        assertionsValid(5, 3, 28, 5, 2);
        assertionsValid(5, 3, 30, 5, 2);
        //3-th entrance
        // 1 floor, 3 entrance (5х3)
        assertionsValid(5, 3, 31, 1, 3);
        assertionsValid(5, 3, 33, 1, 3);
        // 2 floor, 3 entrance (5х3)
        assertionsValid(5, 3, 34, 2, 3);
        assertionsValid(5, 3, 36, 2, 3);
        // 3 floor, 3 entrance (5х3)
        assertionsValid(5, 3, 37, 3, 3);
        assertionsValid(5, 3, 39, 3, 3);
        // 4 floor, 3 entrance (5х3)
        assertionsValid(5, 3, 40, 4, 3);
        assertionsValid(5, 3, 42, 4, 3);
        // 5 floor, 3 entrance (5х3)
        assertionsValid(5, 3, 43, 5, 3);
        assertionsValid(5, 3, 45, 5, 3);
        //4-th entrance
        // 1 floor, 4 entrance (5х3)
        assertionsValid(5, 3, 46, 1, 4);
        assertionsValid(5, 3, 48, 1, 4);
        // 2 floor, 4 entrance (5х3)
        assertionsValid(5, 3, 49, 2, 4);
        assertionsValid(5, 3, 51, 2, 4);
        // 3 floor, 4 entrance (5х3)
        assertionsValid(5, 3, 52, 3, 4);
        assertionsValid(5, 3, 54, 3, 4);
        // 4 floor, 4 entrance (5х3)
        assertionsValid(5, 3, 55, 4, 4);
        assertionsValid(5, 3, 57, 4, 4);
        // 5 floor, 4 entrance (5х3)
        assertionsValid(5, 3, 58, 5, 4);
        assertionsValid(5, 3, 60, 5, 4);
        //5 entrance
        // 1 floor, 5 entrance (5х3)
        assertionsValid(5, 3, 61, 1, 5);
        assertionsValid(5, 3, 63, 1, 5);
        // 2 floor, 5 entrance (5х3)
        assertionsValid(5, 3, 64, 2, 5);
        assertionsValid(5, 3, 66, 2, 5);
        // 3 floor, 5 entrance (5х3)
        assertionsValid(5, 3, 67, 3, 5);
        assertionsValid(5, 3, 69, 3, 5);
        // 4 floor, 5 entrance (5х3)
        assertionsValid(5, 3, 70, 4, 5);
        assertionsValid(5, 3, 72, 4, 5);
        // 5 floor, 5 entrance (5х3)
        assertionsValid(5, 3, 73, 5, 5);
        assertionsValid(5, 3, 75, 5, 5);
        //6-th entrance
        // 1 floor, 6 entrance (5х3)
        assertionsValid(5, 3, 76, 1, 6);
        assertionsValid(5, 3, 78, 1, 6);
        // 2 floor, 6 entrance (5х3)
        assertionsValid(5, 3, 79, 2, 6);
        assertionsValid(5, 3, 81, 2, 6);
        // 3 floor, 6 entrance (5х3)
        assertionsValid(5, 3, 82, 3, 6);
        assertionsValid(5, 3, 84, 3, 6);
        // 4 floor, 6 entrance (5х3)
        assertionsValid(5, 3, 85, 4, 6);
        assertionsValid(5, 3, 87, 4, 6);
        // 5 floor, 6 entrance (5х3)
        assertionsValid(5, 3, 88, 5, 6);
        assertionsValid(5, 3, 90, 5, 6);

        //House with 9 floors with 8 apartments per floor
        //1-th entrance
        // 1 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 1, 1, 1);
        assertionsValid(9, 8, 8, 1, 1);
        // 2 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 9, 2, 1);
        assertionsValid(9, 8, 16, 2, 1);
        // 3 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 17, 3, 1);
        assertionsValid(9, 8, 24, 3, 1);
        // 4 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 25, 4, 1);
        assertionsValid(9, 8, 32, 4, 1);
        // 5 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 33, 5, 1);
        assertionsValid(9, 8, 40, 5, 1);
        // 6 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 41, 6, 1);
        assertionsValid(9, 8, 48, 6, 1);
        // 7 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 49, 7, 1);
        assertionsValid(9, 8, 56, 7, 1);
        // 8 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 57, 8, 1);
        assertionsValid(9, 8, 64, 8, 1);
        // 9 floor, 1 entrance (9х8)
        assertionsValid(9, 8, 65, 9, 1);
        assertionsValid(9, 8, 72, 9, 1);
        //2-th entrance
        // 1 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 73, 1, 2);
        assertionsValid(9, 8, 80, 1, 2);
        // 2 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 81, 2, 2);
        assertionsValid(9, 8, 88, 2, 2);
        // 3 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 89, 3, 2);
        assertionsValid(9, 8, 96, 3, 2);
        // 4 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 97, 4, 2);
        assertionsValid(9, 8, 104, 4, 2);
        // 5 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 105, 5, 2);
        assertionsValid(9, 8, 112, 5, 2);
        // 6 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 113, 6, 2);
        assertionsValid(9, 8, 120, 6, 2);
        // 7 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 121, 7, 2);
        assertionsValid(9, 8, 128, 7, 2);
        // 8 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 129, 8, 2);
        assertionsValid(9, 8, 136, 8, 2);
        // 9 floor, 2 entrance (9х8)
        assertionsValid(9, 8, 137, 9, 2);
        assertionsValid(9, 8, 144, 9, 2);
        //3-th entrance
        // 1 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 145, 1, 3);
        assertionsValid(9, 8, 152, 1, 3);
        // 2 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 153, 2, 3);
        assertionsValid(9, 8, 160, 2, 3);
        // 3 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 161, 3, 3);
        assertionsValid(9, 8, 168, 3, 3);
        // 4 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 169, 4, 3);
        assertionsValid(9, 8, 176, 4, 3);
        // 5 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 177, 5, 3);
        assertionsValid(9, 8, 184, 5, 3);
        // 6 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 185, 6, 3);
        assertionsValid(9, 8, 192, 6, 3);
        // 7 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 193, 7, 3);
        assertionsValid(9, 8, 200, 7, 3);
        // 8 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 201, 8, 3);
        assertionsValid(9, 8, 208, 8, 3);
        // 9 floor, 3 entrance (9х8)
        assertionsValid(9, 8, 209, 9, 3);
        assertionsValid(9, 8, 216, 9, 3);
        //4-th entrance
        // 1 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 217, 1, 4);
        assertionsValid(9, 8, 224, 1, 4);
        // 2 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 225, 2, 4);
        assertionsValid(9, 8, 232, 2, 4);
        // 3 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 233, 3, 4);
        assertionsValid(9, 8, 240, 3, 4);
        // 4 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 241, 4, 4);
        assertionsValid(9, 8, 248, 4, 4);
        // 5 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 249, 5, 4);
        assertionsValid(9, 8, 256, 5, 4);
        // 6 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 257, 6, 4);
        assertionsValid(9, 8, 264, 6, 4);
        // 7 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 265, 7, 4);
        assertionsValid(9, 8, 272, 7, 4);
        // 8 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 273, 8, 4);
        assertionsValid(9, 8, 280, 8, 4);
        // 9 floor, 4 entrance (9х8)
        assertionsValid(9, 8, 281, 9, 4);
        assertionsValid(9, 8, 288, 9, 4);

        //House with 16 floors with 8 apartments per floor
        // 1-th entrance
        // 1 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 1, 1, 1);
        assertionsValid(16, 8, 8, 1, 1);
        // 2 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 9, 2, 1);
        assertionsValid(16, 8, 16, 2, 1);
        // 3 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 17, 3, 1);
        assertionsValid(16, 8, 24, 3, 1);
        // 4 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 25, 4, 1);
        assertionsValid(16, 8, 32, 4, 1);
        // 5 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 33, 5, 1);
        assertionsValid(16, 8, 40, 5, 1);
        // 6 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 41, 6, 1);
        assertionsValid(16, 8, 48, 6, 1);
        // 7 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 49, 7, 1);
        assertionsValid(16, 8, 56, 7, 1);
        // 8 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 57, 8, 1);
        assertionsValid(16, 8, 64, 8, 1);
        // 9 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 65, 9, 1);
        assertionsValid(16, 8, 72, 9, 1);
        // 10 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 73, 10, 1);
        assertionsValid(16, 8, 80, 10, 1);
        // 11 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 81, 11, 1);
        assertionsValid(16, 8, 88, 11, 1);
        // 12 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 89, 12, 1);
        assertionsValid(16, 8, 96, 12, 1);
        // 13 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 97, 13, 1);
        assertionsValid(16, 8, 104, 13, 1);
        // 14 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 105, 14, 1);
        assertionsValid(16, 8, 112, 14, 1);
        // 15 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 113, 15, 1);
        assertionsValid(16, 8, 120, 15, 1);
        // 16 floor, 1 entrance (16х8)
        assertionsValid(16, 8, 121, 16, 1);
        assertionsValid(16, 8, 128, 16, 1);
        //2-th entrance
        // 1 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 129, 1, 2);
        assertionsValid(16, 8, 136, 1, 2);
        // 2 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 137, 2, 2);
        assertionsValid(16, 8, 144, 2, 2);
        // 3 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 145, 3, 2);
        assertionsValid(16, 8, 152, 3, 2);
        // 4 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 153, 4, 2);
        assertionsValid(16, 8, 160, 4, 2);
        // 5 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 161, 5, 2);
        assertionsValid(16, 8, 168, 5, 2);
        // 6 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 169, 6, 2);
        assertionsValid(16, 8, 176, 6, 2);
        // 7 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 177, 7, 2);
        assertionsValid(16, 8, 184, 7, 2);
        // 8 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 185, 8, 2);
        assertionsValid(16, 8, 192, 8, 2);
        // 9 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 193, 9, 2);
        assertionsValid(16, 8, 200, 9, 2);
        // 10 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 201, 10, 2);
        assertionsValid(16, 8, 208, 10, 2);
        // 11 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 209, 11, 2);
        assertionsValid(16, 8, 216, 11, 2);
        // 12 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 217, 12, 2);
        assertionsValid(16, 8, 224, 12, 2);
        // 13 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 225, 13, 2);
        assertionsValid(16, 8, 232, 13, 2);
        // 14 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 233, 14, 2);
        assertionsValid(16, 8, 240, 14, 2);
        // 15 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 241, 15, 2);
        assertionsValid(16, 8, 248, 15, 2);
        // 16 floor, 2 entrance (16х8)
        assertionsValid(16, 8, 249, 16, 2);
        assertionsValid(16, 8, 256, 16, 2);

        //House with 20_000 floors with 20_000 apartments per floor
        //1-th entrance
        //1 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 1, 1, 1);
        assertionsValid(20_000, 20_000, 20_000, 1, 1);
        //2 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 20_001, 2, 1);
        assertionsValid(20_000, 20_000, 40_000, 2, 1);
        //3 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 40_001, 3, 1);
        assertionsValid(20_000, 20_000, 60_000, 3, 1);
        //4 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 60_001, 4, 1);
        assertionsValid(20_000, 20_000, 80_000, 4, 1);
        //5 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 80_001, 5, 1);
        assertionsValid(20_000, 20_000, 100_000, 5, 1);
        //6 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 100_001, 6, 1);
        assertionsValid(20_000, 20_000, 120_000, 6, 1);
        //7 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 120_001, 7, 1);
        assertionsValid(20_000, 20_000, 140_000, 7, 1);
        //8 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 140_001, 8, 1);
        assertionsValid(20_000, 20_000, 160_000, 8, 1);
        //9 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 160_001, 9, 1);
        assertionsValid(20_000, 20_000, 180_000, 9, 1);
        //10 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 180_001, 10, 1);
        assertionsValid(20_000, 20_000, 200_000, 10, 1);
        //11 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 200_001, 11, 1);
        assertionsValid(20_000, 20_000, 220_000, 11, 1);
        //12 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 220_001, 12, 1);
        assertionsValid(20_000, 20_000, 240_000, 12, 1);
        //13 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 240_001, 13, 1);
        assertionsValid(20_000, 20_000, 260_000, 13, 1);
        //14 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 260_001, 14, 1);
        assertionsValid(20_000, 20_000, 280_000, 14, 1);
        //15 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 280_001, 15, 1);
        assertionsValid(20_000, 20_000, 300_000, 15, 1);
        //15 floor, 1 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 399_980_001, 20_000, 1);
        assertionsValid(20_000, 20_000, 400_000_000, 20_000, 1);
        //2-th entrance
        //1 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_000_001, 1, 2);
        assertionsValid(20_000, 20_000, 400_020_000, 1, 2);
        //2 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_020_001, 2, 2);
        assertionsValid(20_000, 20_000, 400_040_000, 2, 2);
        //3 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_040_001, 3, 2);
        assertionsValid(20_000, 20_000, 400_060_000, 3, 2);
        //4 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_060_001, 4, 2);
        assertionsValid(20_000, 20_000, 400_080_000, 4, 2);
        //5 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_080_001, 5, 2);
        assertionsValid(20_000, 20_000, 400_100_000, 5, 2);
        //6 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_100_001, 6, 2);
        assertionsValid(20_000, 20_000, 400_120_000, 6, 2);
        //7 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_120_001, 7, 2);
        assertionsValid(20_000, 20_000, 400_140_000, 7, 2);
        //8 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_140_001, 8, 2);
        assertionsValid(20_000, 20_000, 400_160_000, 8, 2);
        //9 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_160_001, 9, 2);
        assertionsValid(20_000, 20_000, 400_180_000, 9, 2);
        //10 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_180_001, 10, 2);
        assertionsValid(20_000, 20_000, 400_200_000, 10, 2);
        //11 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_200_001, 11, 2);
        assertionsValid(20_000, 20_000, 400_220_000, 11, 2);
        //12 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_220_001, 12, 2);
        assertionsValid(20_000, 20_000, 400_240_000, 12, 2);
        //13 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_240_001, 13, 2);
        assertionsValid(20_000, 20_000, 400_260_000, 13, 2);
        //14 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_260_001, 14, 2);
        assertionsValid(20_000, 20_000, 400_280_000, 14, 2);
        //15 floor, 2 entrance (20_000 х 20_000)
        assertionsValid(20_000, 20_000, 400_280_001, 15, 2);
        assertionsValid(20_000, 20_000, 400_300_000, 15, 2);

        //House with 1_073_741_822 floors with 1_073_741_822 apartments per floor
        //1-th floor (1_073_741_822 x 1_073_741_822)
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 1, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 2, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 3, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 4, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 5, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 6, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 7, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 8, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 9, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 10, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 11, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 12, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 13, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 14, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 15, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 16, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 17, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 18, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 19, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 20, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 21, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 22, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 23, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 24, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 25, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 26, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 27, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 28, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 29, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 30, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 31, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 32, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 33, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 34, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 35, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 36, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 37, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 38, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 39, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 40, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 41, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 42, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 43, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 44, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 45, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 46, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 47, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 48, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 49, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 50, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 51, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 52, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 53, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 54, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 55, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 56, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 57, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 58, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 59, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 60, 1, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, MAX_HALF_MINUS, 1, 1);
        //2-th floor
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, MAX_HALF, 2, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, MAX_HALF_PLUS, 2, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 2147483644, 2, 1);
        //3-th floor
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, 2147483645, 3, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, MAX_MINUS, 3, 1);
        assertionsValid(MAX_HALF_MINUS, MAX_HALF_MINUS, MAX_LEGAL_ARGUMENT, 3, 1);

        //House with 1_073_741_823 floors with 1_073_741_823 apartments per floor
        //1-th floor (1_073_741_823 x 1_073_741_823)
        assertionsValid(MAX_HALF, MAX_HALF, 1, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 2, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 3, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 4, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 5, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 6, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 7, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 8, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 9, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 10, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 11, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 12, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 13, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 14, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 15, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 16, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 17, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 18, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 19, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 20, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 21, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 22, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 23, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 24, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 25, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 26, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 27, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 28, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 29, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 30, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 31, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 32, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 33, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 34, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 35, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 36, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 37, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 38, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 39, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 40, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 41, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 42, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 43, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 44, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 45, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 46, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 47, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 48, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 49, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 50, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 51, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 52, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 53, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 54, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 55, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 56, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 57, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 58, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 59, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, 60, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, MAX_HALF_MINUS, 1, 1);
        assertionsValid(MAX_HALF, MAX_HALF, MAX_HALF, 1, 1);
        //2-th floor (1_073_741_823 x 1_073_741_823)
        assertionsValid(MAX_HALF, MAX_HALF, MAX_HALF_PLUS, 2, 1);
        assertionsValid(MAX_HALF, MAX_HALF, MAX_MINUS, 2, 1);
        //3-th floor (1_073_741_823 x 1_073_741_823)
        assertionsValid(MAX_HALF, MAX_HALF, MAX_LEGAL_ARGUMENT, 3, 1);

        //House with 1_073_741_824 floors with 1_073_741_824 apartments per floor
        //1-th floor (1_073_741_824 x 1_073_741_824)
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 1, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 2, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 3, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 4, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 5, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 6, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 7, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 8, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 9, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 10, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 11, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 12, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 13, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 14, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 15, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 16, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 17, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 18, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 19, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 20, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 21, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 22, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 23, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 24, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 25, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 26, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 27, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 28, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 29, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 30, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 31, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 32, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 33, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 34, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 35, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 36, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 37, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 38, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 39, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 40, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 41, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 42, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 43, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 44, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 45, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 46, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 47, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 48, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 49, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 50, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 51, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 52, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 53, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 54, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 55, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 56, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 57, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 58, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 59, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, 60, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, MAX_HALF_MINUS, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, MAX_HALF, 1, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, MAX_HALF_PLUS, 1, 1);
        //2-th floor (1_073_741_824 x 1_073_741_824)
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, MAX_HALF_PLUS + 1, 2, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, MAX_MINUS, 2, 1);
        assertionsValid(MAX_HALF_PLUS, MAX_HALF_PLUS, MAX_LEGAL_ARGUMENT, 2, 1);

        //House with 2_147_483_646 floors with 2_147_483_646 apartments per floor
        //1-th floor (2_147_483_646 x 2_147_483_646)
        assertionsValid(MAX_MINUS, MAX_MINUS, 1, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 2, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 3, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 4, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 5, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 6, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 7, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 8, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 9, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 10, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 11, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 12, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 13, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 14, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 15, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 16, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 17, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 18, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 19, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 20, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 21, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 22, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 23, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 24, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 25, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 26, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 27, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 28, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 29, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 30, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 31, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 32, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 33, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 34, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 35, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 36, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 37, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 38, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 39, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 40, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 41, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 42, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 43, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 44, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 45, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 46, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 47, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 48, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 49, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 50, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 51, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 52, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 53, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 54, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 55, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 56, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 57, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 58, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 59, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, 60, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, MAX_HALF_MINUS, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, MAX_HALF, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, MAX_HALF_PLUS, 1, 1);
        assertionsValid(MAX_MINUS, MAX_MINUS, MAX_MINUS, 1, 1);
        //2-th floor (2_147_483_646 x 2_147_483_646)
        assertionsValid(MAX_MINUS, MAX_MINUS, MAX_LEGAL_ARGUMENT, 2, 1);

        //House with 2_147_483_647 floors with 2_147_483_647 apartments per floor
        //1-th floor (2_147_483_647 x 2_147_483_647)
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 2, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 3, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 4, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 5, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 6, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 7, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 8, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 9, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 10, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 11, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 12, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 13, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 14, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 15, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 16, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 17, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 18, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 19, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 20, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 21, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 22, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 23, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 24, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 25, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 26, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 27, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 28, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 29, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 30, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 31, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 32, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 33, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 34, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 35, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 36, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 37, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 38, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 39, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 40, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 41, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 42, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 43, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 44, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 45, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 46, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 47, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 48, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 49, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 50, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 51, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 52, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 53, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 54, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 55, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 56, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 57, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 58, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 59, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 60, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_HALF_MINUS, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_HALF, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_HALF_PLUS, 1, 1);
        assertionsValid(MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, MAX_LEGAL_ARGUMENT, 1, 1);

//------Random
        assertionsValid(14, 114, 77, 1, 1);
        assertionsValid(24, 9, 453, 3, 3);
        assertionsValid(26, 4, 66, 17, 1);
        assertionsValid(57, 44, 44, 1, 1);
        assertionsValid(59, 5, 55, 11, 1);
        assertionsValid(66, 98, 988, 11, 1);
        assertionsValid(77, 7, 124, 18, 1);
        assertionsValid(88, 8, 1478, 9, 3);
        assertionsValid(96, 11, 477, 44, 1);
        assertionsValid(98, 64, 5155, 81, 1);
        assertionsValid(126, 122, 89, 1, 1);
        assertionsValid(268, 3, 874, 24, 2);
        assertionsValid(478, 88, 23, 1, 1);
        assertionsValid(544, 488, 89, 1, 1);
        assertionsValid(555, 24, 14, 1, 1);
        assertionsValid(568, 1223, 155, 1, 1);
        assertionsValid(665, 58, 99, 2, 1);
        assertionsValid(811, 458, 568, 2, 1);
        assertionsValid(1478, 14, 445, 32, 1);
        assertionsValid(8985, 5114, 944, 1, 1);
    }

    @Test
    void findFloorEntranceNotValid() {
        //Combinations invalid argument with invalid
        combinationsNotValid(0);
        combinationsNotValid(-1);
        combinationsNotValid(MIN_HALF_PLUS);
        combinationsNotValid(MIN_HALF);
        combinationsNotValid(MIN_HALF_MINUS);
        combinationsNotValid(MIN_PLUS);
        combinationsNotValid(MIN_VALUE);
        //Combinations invalid argument with valid
        combinationsNotValid(1);
        combinationsNotValid(2);
        combinationsNotValid(MAX_HALF_MINUS);
        combinationsNotValid(MAX_HALF);
        combinationsNotValid(MAX_HALF_PLUS);
        combinationsNotValid(MAX_MINUS);
        combinationsNotValid(MAX_LEGAL_ARGUMENT);
        //Combinations invalid argument with first 60 apartments
        combinationsNotValid(1);
        combinationsNotValid(2);
        combinationsNotValid(3);
        combinationsNotValid(4);
        combinationsNotValid(5);
        combinationsNotValid(6);
        combinationsNotValid(7);
        combinationsNotValid(8);
        combinationsNotValid(9);
        combinationsNotValid(10);
        combinationsNotValid(11);
        combinationsNotValid(12);
        combinationsNotValid(13);
        combinationsNotValid(14);
        combinationsNotValid(15);
        combinationsNotValid(16);
        combinationsNotValid(17);
        combinationsNotValid(18);
        combinationsNotValid(19);
        combinationsNotValid(20);
        combinationsNotValid(21);
        combinationsNotValid(22);
        combinationsNotValid(23);
        combinationsNotValid(24);
        combinationsNotValid(25);
        combinationsNotValid(26);
        combinationsNotValid(27);
        combinationsNotValid(28);
        combinationsNotValid(29);
        combinationsNotValid(30);
        combinationsNotValid(31);
        combinationsNotValid(32);
        combinationsNotValid(33);
        combinationsNotValid(34);
        combinationsNotValid(35);
        combinationsNotValid(36);
        combinationsNotValid(37);
        combinationsNotValid(38);
        combinationsNotValid(39);
        combinationsNotValid(40);
        combinationsNotValid(41);
        combinationsNotValid(42);
        combinationsNotValid(43);
        combinationsNotValid(44);
        combinationsNotValid(45);
        combinationsNotValid(46);
        combinationsNotValid(47);
        combinationsNotValid(48);
        combinationsNotValid(49);
        combinationsNotValid(50);
        combinationsNotValid(51);
        combinationsNotValid(52);
        combinationsNotValid(53);
        combinationsNotValid(54);
        combinationsNotValid(55);
        combinationsNotValid(56);
        combinationsNotValid(57);
        combinationsNotValid(58);
        combinationsNotValid(59);
        combinationsNotValid(60);
        //Character values
        assertionsNotValidMain("ppp", "5", "oo", "Floors = ", "Expected: integer type \r\nGot: ppp");
        assertionsNotValidMain("5", "hh", "7", "Floors = Apartments on floor = ", "Expected: integer type \r\nGot: hh");
        assertionsNotValidMain("8", "5", "oo", "Floors = Apartments on floor = Number apartment = ", "Expected: integer type \r\nGot: oo");
        assertionsNotValidMain("-", "44", "222", "Floors = ", "Expected: integer type \r\nGot: -");
        assertionsNotValidMain("5", "!", "1", "Floors = Apartments on floor = ", "Expected: integer type \r\nGot: !");
        assertionsNotValidMain("98", "66", "number", "Floors = Apartments on floor = Number apartment = ", "Expected: integer type \r\nGot: number");
        assertionsNotValidMain("This number", "5", "oo", "Floors = ", "Expected: integer type \r\nGot: This number");
        assertionsNotValidMain("5", "please_save_number", "7", "Floors = Apartments on floor = ", "Expected: integer type \r\nGot: please_save_number");
        assertionsNotValidMain("764", "09", "no", "Floors = Apartments on floor = Number apartment = ", "Expected: integer type \r\nGot: no");
        assertionsNotValidMain("oitg", "5", "oo", "Floors = ", "Expected: integer type \r\nGot: oitg");
        assertionsNotValidMain("77", "lk", "7", "Floors = Apartments on floor = ", "Expected: integer type \r\nGot: lk");
        assertionsNotValidMain("778", "5", "llll", "Floors = Apartments on floor = Number apartment = ", "Expected: integer type \r\nGot: llll");
    }

    //------The check method for valid arguments
    void assertionsValid(int floors, int apartmentsOnFloor, int apartSearch, int getFloorNumber, int getEntranceNumber) {
        House house = new House(floors, apartmentsOnFloor);
        assertEquals(getFloorNumber, house.floorNumber(apartSearch));
        assertEquals(getEntranceNumber, house.entranceNumber(apartSearch));

        assertionsValidMain(floors, apartmentsOnFloor, apartSearch, getFloorNumber, getEntranceNumber);
    }

    //------The check method for valid arguments
    void assertionsValidMain(int floors, int apartmentsOnFloor, int apartSearch, int getFloorNumber, int getEntranceNumber) {
        String input = floors + "\r\n" + apartmentsOnFloor + "\r\n" + apartSearch;
        String result = main(input);
        String expected = "Welcome!\r\nEnter values:\r\n" + "Floors = Apartments on floor = Number apartment = "
                + getFloorNumber + " floor, " + getEntranceNumber + " entrance";

        assertEquals(expected, result);
    }

    //------The check method for invalid arguments
    void assertionsNotValid(int floors, int apartmentsOnFloor, int apartSearch, String parameter, String error) {

        try {
            House house = new House(floors, apartmentsOnFloor);
            house.floorNumber(apartSearch);
            house.entranceNumber(apartSearch);
            fail();

        } catch (IllegalArgumentException e) {
            assertEquals(error, e.getMessage());
        }

        assertionsNotValidMain(Integer.valueOf(floors).toString(), Integer.valueOf(apartmentsOnFloor).toString(), Integer.valueOf(apartSearch).toString(), parameter, error);
    }

    //------The check method for invalid arguments
    void assertionsNotValidMain(String floors, String apartmentsOnFloor, String apartSearch, String parametr, String error) {
        String input = floors + "\r\n" + apartmentsOnFloor + "\r\n" + apartSearch;
        String result = main(input);
        String expected = "Welcome!\r\nEnter values:\r\n" + parametr + error;

        assertEquals(expected, result);
    }


    //----The method combines invalid argument
    void combinationsNotValid(int x) {
        String parameters = "Floors = ";
        String printThreeParam = "Expected: from " + MIN_LEGAL_ARGUMENT + " to " + MAX_LEGAL_ARGUMENT;

        assertionsNotValid(0, 0, x, parameters, printThreeParam + "\r\nGot: 0");
        assertionsNotValid(-1, -1, x, parameters, printThreeParam + "\r\nGot: -1");
        assertionsNotValid(-2, -2, x, parameters, printThreeParam + "\r\nGot: -2");
        assertionsNotValid(-1073741823, -1073741823, x, parameters, printThreeParam + "\r\nGot: -1073741823");
        assertionsNotValid(-1073741824, -1073741824, x, parameters, printThreeParam + "\r\nGot: -1073741824");
        assertionsNotValid(-1073741825, -1073741825, x, parameters, printThreeParam + "\r\nGot: -1073741825");
        assertionsNotValid(-2147483647, -2147483647, x, parameters, printThreeParam + "\r\nGot: -2147483647");
        assertionsNotValid(-2147483648, -2147483648, x, parameters, printThreeParam + "\r\nGot: -2147483648");

    }

    //----The method imitates console enter from user, and returns string output in console
    String main(String input) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Task2House.main(new String[0]);

        return outputStream.toString().trim();
    }
}
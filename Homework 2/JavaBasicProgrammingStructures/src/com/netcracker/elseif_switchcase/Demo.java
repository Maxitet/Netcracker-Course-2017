package com.netcracker.elseif_switchcase;

import java.util.Random;

enum Guitar {
    Jackson, Gibson, Schecter, Esp, Fender, Parker, Yamaha, Ibanez, Epiphone, Peavey, BCRich, Aria, Line6, Washburn, Cort
}

public class Demo {

    public static void main(String[] args) {
        long startTime;
        long estimatedTime;
        Guitar gr = Guitar.BCRich;


        startTime = System.nanoTime();

        if(gr == Guitar.Jackson) {
            System.out.println("Jackson guitars");
        } else if (gr == Guitar.Gibson) {
            System.out.println("Gibson guitars");
        } else if (gr == Guitar.Schecter) {
            System.out.println("Fender guitars");
        } else if (gr == Guitar.Esp) {
            System.out.println("ESP guitars");
        } else if (gr == Guitar.Fender) {
            System.out.println("Fender guitars");
        } else if (gr == Guitar.Parker) {
            System.out.println("Parker guitars");
        } else if (gr == Guitar.Yamaha) {
            System.out.println("Yamaha guitars");
        } else if (gr == Guitar.Ibanez) {
            System.out.println("Ibanez guitars");
        } else if (gr == Guitar.Epiphone) {
            System.out.println("Epiphone guitars");
        } else if (gr == Guitar.Peavey) {
            System.out.println("Peavey guitars");
        } else if (gr == Guitar.BCRich) {
            System.out.println("B.C.Rich guitars");
        } else if (gr == Guitar.Aria) {
            System.out.println("Aria guitars");
        } else if (gr == Guitar.Line6) {
            System.out.println("Line6 guitars");
        } else if (gr == Guitar.Washburn) {
            System.out.println("Washburn guitars");
        } else if (gr == Guitar.Cort) {
            System.out.println("Cort guitars");
        }

        estimatedTime = System.nanoTime() - startTime;

        System.out.println("Время выполнения else-if " + estimatedTime);

        startTime = System.nanoTime();

        switch(gr) {
            case Jackson:
                System.out.println("Jackson guitar");
                break;
            case Gibson:
                System.out.println("Gibson guitar");
                break;
            case Schecter:
                System.out.println("Schecter guitar");
                break;
            case Esp:
                System.out.println("ESP guitar");
                break;
            case Fender:
                System.out.println("Fender guitar");
                break;
            case Parker:
                System.out.println("Parker guitars");
                break;
            case Yamaha:
                System.out.println("Yamaha guitars");
                break;
            case Ibanez:
                System.out.println("Ibanez guitars");
                break;
            case Epiphone:
                System.out.println("Epiphone guitars");
                break;
            case Peavey:
                System.out.println("Peavey guitars");
                break;
            case BCRich:
                System.out.println("B.C.Rich guitars");
                break;
            case Aria:
                System.out.println("Aria guitars");
                break;
            case Line6:
                System.out.println("Line6 guitars");
                break;
            case Washburn:
                System.out.println("Washburn guitars");
                break;
            case Cort:
                System.out.println("Cort guitars");
                break;
        }

        estimatedTime = System.nanoTime() - startTime;

        System.out.println("Время работы switch-case " + estimatedTime);

        System.out.println("Массив из 50 элементов");

        int[] array = new int[50];
        int[] numbersOne = new int[11];
        int[] numbersTwo = new int[11];
        Random random = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }

        startTime = System.nanoTime();

        for(int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 0:
                    numbersOne[0]++;
                    System.out.print(0 + " ");
                    break;
                case 1:
                    numbersOne[1]++;
                    System.out.print(1 + " ");
                    break;
                case 2:
                    numbersOne[2]++;
                    System.out.print(2 + " ");
                    break;
                case 3:
                    numbersOne[3]++;
                    System.out.print(3 + " ");
                    break;
                case 4:
                    numbersOne[4]++;
                    System.out.print(4 + " ");
                    break;
                case 5:
                    numbersOne[5]++;
                    System.out.print(5 + " ");
                    break;
                case 6:
                    numbersOne[6]++;
                    System.out.print(6 + " ");
                    break;
                case 7:
                    numbersOne[7]++;
                    System.out.print(7 + " ");
                    break;
                case 8:
                    numbersOne[8]++;
                    System.out.print(8 + " ");
                    break;
                case 9:
                    numbersOne[9]++;
                    System.out.print(9 + " ");
                    break;
                case 10:
                    numbersOne[10]++;
                    System.out.print(10 + " ");
                    break;
            }
        }

        estimatedTime = System.nanoTime() - startTime;
        System.out.println();
        System.out.println("Время выполнения switch-case: " + estimatedTime);

        System.out.println("Попадание элементов в ветки от 0 до 10: ");

        for(int i : numbersOne) {
            System.out.print(i + " ");
        }
        System.out.println();

        startTime = System.nanoTime();

        for(int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                numbersTwo[0]++;
                System.out.print(0 + " ");
            }
            else if(array[i] == 1) {
                numbersTwo[1]++;
                System.out.print(0 + " ");
            }
            else if(array[i] == 2) {
                numbersTwo[2]++;
                System.out.print(2 + " ");
            }
            else if(array[i] == 3) {
                numbersTwo[3]++;
                System.out.print(3 + " ");
            }
            else if(array[i] == 4) {
                numbersTwo[4]++;
                System.out.print(4 + " ");
            }
            else if(array[i] == 5) {
                numbersTwo[5]++;
                System.out.print(5 + " ");
            }
            else if(array[i] == 6) {
                numbersTwo[6]++;
                System.out.print(6 + " ");
            }
            else if(array[i] == 7) {
                numbersTwo[7]++;
                System.out.print(7 + " ");
            }
            else if(array[i] == 8) {
                numbersTwo[8]++;
                System.out.print(8 + " ");
            }
            else if(array[i] == 9) {
                numbersTwo[9]++;
                System.out.print(9 + " ");
            }
            else if(array[i] == 10) {
                numbersTwo[10]++;
                System.out.print(10 + " ");
            }
        }

        estimatedTime = System.nanoTime() - startTime;
        System.out.println();
        System.out.println("Время выполнения else-if: " + estimatedTime);

        for(int i : numbersOne) {
            System.out.print(i + " ");
        }
    }
}

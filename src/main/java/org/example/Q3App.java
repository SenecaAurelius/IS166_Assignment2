package org.example;

public class Q3App {

    public static void main(String[] args) {
        Q3 q = new Q3();
        Q3 qq = new Q3(5);
        q.fun();
        qq.fun(9,4 );
        Q3 myQObj = new Q3(10); // YOU HAD A TYPO HERE. lowercase O in myQObj
        myQObj.x = 5;
        int y = 22;

        processQ(myQObj, y);
        System.out.println(myQObj.x);
        System.out.println(y);


        System.out.println("-------------");

        System.out.print("q.fun(8, 9.3); : ");
        q.fun(8, 9.3);
    }

    public static void processQ(Q3 myQObj, int y) {
        myQObj.x = 7;
        y = 25;
    }
}

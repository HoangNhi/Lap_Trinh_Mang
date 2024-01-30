package Java26;

public class Vidu {
    public static void main(String[] args) {
//        int out, in = 0;
//        for (out = 0; out<10; out++){
//            for (in = 0; in<20;in++){
//                if(in>10) break;
//            }
//            System.out.println("Ben trong vong lap out: out = " + out + ", in  = " + in);
//        }
//        System.out.println("Ben ngoai vong lap out: out = " + out + ", in = " +in);

//        int out, in = 0;
//		outer: for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break outer; // Break outer loop
//			}
//			System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
//		}
//		System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);

//        int max = 100;
//		for (int i = 0; i < max; i++) {
//			if(i<50)
//				continue;
//			System.out.println(i);
//		}

//        outer: for(int i=2; i<=9; i++) {
//			for(int j=1; j<=10; j++) {
//				if(j>5)
//					continue outer;
//				System.out.println(i+" * "+j +" = "+(i*j));
//			}
//			System.out.println("-----");
//		}

        for(int i=2; i<=9; i++) {
            for(int j=1; j<=10; j++) {
                if(j>5)
                    return;
                System.out.println(i+" * "+j +" = "+(i*j));
            }
            System.out.println("-----");
        }
        System.out.println("ABC");
    }
}

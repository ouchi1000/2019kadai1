package itecafe;

import java.util.Scanner;   //Scannerをインポートさせた

public class ITECafe {

    public static void main(String[] args) {

        //商品情報　　　　　　　　　　　Itemクラスの引数を引き出す　コンストラクタからの引数
        //ドリンク
        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item tea = new Item(2, "紅茶", 260);
        Item Icecoffee = new Item(3, "アイスコーヒー", 200);
        Item Icetea = new Item(4, "アイスティー", 200);

        //スイーツ
        Item syotocake = new Item(5, "ショートケーキ", 400);
        Item czucake = new Item(6, "チーズケーキ", 400);
        Item cokocake = new Item(7, "チョコレートケーキ", 450);
        Item cokobananapafe = new Item(8, "チョコバナナパフェ", 390);
        Item itigopafe = new Item(9, "イチゴパフェ", 390);

        //軽食
        Item mipasuta = new Item(10, "ミートパスタ", 650);
        Item mixpiza = new Item(11, "ミックスピザ", 700);

        //パン
        Item kurowassann = new Item(12, "クロワッサン", 180);
        Item pan = new Item(13, "トーストサンド", 200);
        Item hurennti = new Item(14, "フレンチトースト", 210);

        //アイテムの配列を作る
        Item[] items = new Item[14];
        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = Icecoffee;
        items[3] = Icetea;
        items[4] = syotocake;
        items[5] = czucake;
        items[6] = cokocake;
        items[7] = cokobananapafe;
        items[8] = itigopafe;
        items[9] = mipasuta;
        items[10] = mixpiza;
        items[11] = kurowassann;
        items[12] = pan;
        items[13] = hurennti;

        Scanner scan = new Scanner(System.in);

        int inputNum;    //入力された商品番号
        int Co;          //入力された個数
        int yn = (3);      //選択
        long kaikei = 0; //会計
        String retiito = "";

        //メニューを表示する
        while (true) {
            while (true) {
                System.out.println("■■■■ITECafeシステムへ■■■■");
                System.out.println("[ドリンク]");
                System.out.println(" " + hotcoffee.getNo() + "：" + hotcoffee.getName() + "　　     " + hotcoffee.getPrice() + "円");
                System.out.println(" " + tea.getNo() + "：" + tea.getName() + "　　　　　　　     " + tea.getPrice() + "円");
                System.out.println(" " + Icecoffee.getNo() + "：" + Icecoffee.getName() + "　　     " + Icecoffee.getPrice() + "円");
                System.out.println(" " + Icetea.getNo() + "：" + Icetea.getName() + "　　　     " + Icetea.getPrice() + "円\n");

                System.out.println("[スイーツ]");
                System.out.println(" " + syotocake.getNo() + "：" + syotocake.getName() + "　　     " + syotocake.getPrice() + "円");
                System.out.println(" " + czucake.getNo() + "：" + czucake.getName() + "　　　     " + czucake.getPrice() + "円");
                System.out.println(" " + cokocake.getNo() + "：" + cokocake.getName() + "     " + cokocake.getPrice() + "円");
                System.out.println(" " + cokobananapafe.getNo() + "：" + cokobananapafe.getName() + "     " + cokobananapafe.getPrice() + "円");
                System.out.println(" " + itigopafe.getNo() + "：" + itigopafe.getName() + "　　　     " + itigopafe.getPrice() + "円\n");

                System.out.println("[軽食]");
                System.out.println(mipasuta.getNo() + "：" + mipasuta.getName() + "　　 　    " + mipasuta.getPrice() + "円");
                System.out.println(mixpiza.getNo() + "：" + mixpiza.getName() + "　　　     " + mixpiza.getPrice() + "円\n");

                System.out.println("[パン]");
                System.out.println(kurowassann.getNo() + "：" + kurowassann.getName() + "　　　     " + kurowassann.getPrice() + "円");
                System.out.println(pan.getNo() + "：" + pan.getName() + "　 　    " + pan.getPrice() + "円");
                System.out.println(hurennti.getNo() + "：" + hurennti.getName() + "　     " + hurennti.getPrice() + "円\n");

                //商品番号を入力する
                System.out.println("◇商品番号を入力してください◇");
                //例外処理

                while (true) {
                    try {
                        String inputStr;
                        inputStr = scan.next();
                        inputNum = Integer.parseInt(inputStr);

                        System.out.println(items[inputNum - 1].getNo() + "番" + items[inputNum - 1].getName()
                                + " " + items[inputNum - 1].getPrice() + "円です。");

                        //正しく処理されたらループを抜ける
                        break;

                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("【入力エラー：数値を入力してください】");
                    }
                }

                //商品数量
                System.out.println("◇商品個数を入力してください◇");

                while (true) {
                    try {

                        String inputCo;
                        inputCo = scan.next();
                        Co = Integer.parseInt(inputCo);

                        if (Co < 1) {
                            System.out.println("【入力エラー：1以上の数値を入力してください】");

                        } else {
                            System.out.println(items[inputNum - 1].getName() + "が" + Co + "つ");

                            //正しく処理されたらループを抜ける
                            break;
                        }
                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("【入力エラー：数値を入力してください】");
                    }
                }

                //会計
                kaikei += (long) (Co * items[inputNum - 1].getPrice());
                retiito += "\n" + items[inputNum - 1].getName() + "が" + Co + "点";
                while (true) {
                    /*  kaikei += (long) (Co * items[inputNum - 1].getPrice() * zeikinn);*/
                    System.out.println("◇ご注文お決まりでしょうか？◇");
                    System.out.println("1：【はい】 2【追加注文】　0【キャンセル】 ");

                    try {
                        String inputStr;
                        inputStr = scan.next();
                        yn = Integer.parseInt(inputStr);

                        switch (yn) {
                            case 1:
                                rezi(kaikei, retiito);

                            case 0:
                                kaikei = 0;
                                retiito = "";
                                break;

                            case 2:
                                System.out.println(retiito + " " + kaikei + "円");
                                break;
                        }
                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("【入力エラー：数値を入力してください】");
                    }
                    if (yn >= 0 && yn <= 2) {
                        break;
                    }
                }
            }
        }
    }

    public static void rezi(long kaikei, String retiito) {
        double zeikinn = 1.08;
        int tike;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("◇割引券はございますか？◇");
            System.out.println("1：【有】 2【無】");
            try {
                String inputtike;
                inputtike = scan.next();
                tike = Integer.parseInt(inputtike);

                if (tike == 1) {

                    System.out.println("◇割引金額を入力してください◇");
                    try {
                        inputtike = scan.next();
                        tike = Integer.parseInt(inputtike);
                        kaikei -= tike;

                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("【入力エラー：数値を入力してください】");
                    }

                    //正しく処理されたらループを抜ける
                    break;
                } else if (tike == 2) {
                    break;
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("【入力エラー：数値を入力してください】");
            }
        }
        kaikei *= zeikinn;
        if (kaikei < 0) {
            kaikei = 0;
            System.out.println("丁度頂戴致しました。");
        } else {
            System.out.println(retiito + "で" + kaikei + "円でございます。");
        }

        if (kaikei != 0) {
            while (true) {
                System.out.println("◇お支払金額◇");
                try {
                    String inputtike;
                    inputtike = scan.next();
                    tike = Integer.parseInt(inputtike);

                    if (tike >= kaikei) {

                        if (tike == kaikei) {
                            System.out.println("\n丁度頂戴致しました。");
                        } else {
                            System.out.println("\nお釣りは" + (tike - kaikei) + "円です。");
                        }

                        //正しく処理されたらループを抜ける
                        break;
                    }
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("【入力エラー：数値を入力してください】");
                }
            }
        }

        System.out.println("ありがとうございました。\n");
        System.out.println("【適当なキーを入力し、メニューを表示】");
        String inputStr;
        inputStr = scan.next();

    }
}

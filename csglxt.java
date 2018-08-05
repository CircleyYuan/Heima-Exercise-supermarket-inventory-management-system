import java.util.*;
public class csglxt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<huoList> list = new ArrayList<>();
        firstShow();

        all:while (true){
            System.out.println("请您输入操作功能序号：");
            int x = in.nextInt();
            switch (x){
                case 1:
                    thingList(list);
                    break;
                case 2:
                    addThing(list);
                    break;
                case 3:
                    deleteThing(list);
                    break;
                case 4:
                    changeThing(list);
                    break ;
                case 5:
                    break all;
            }
        }
    }
    public static void firstShow(){
        System.out.println("===============欢迎光临CircleYuan超市===============");
        System.out.println("1.货物清单 2.添加新货物 3.删除货物 4.修改货物 5.退出");
    }
    public static void thingList(ArrayList<huoList> lists){
        System.out.println("货物清单");
        System.out.println("-------------------商品库存清单---------------------");
        System.out.println("商品编号\t\t商品名称\t\t商品单价");
        for (int i = 0;i < lists.size(); i++){
            huoList h = lists.get(i);

            System.out.println(h.bianhao+"\t\t"+h.mingcheng+"\t\t"+h.price);
        }
    }
    public static void addThing(ArrayList<huoList> lists){
        System.out.println("添加新货物");
        for (int i = 0;i < 1;i++){
            huoList h = new huoList();
            System.out.print("\t请输入新货物的编号：");
            h.bianhao = new Scanner(System.in).nextInt();
            System.out.print("\t请输入新货物的名称：");
            h.mingcheng = new Scanner(System.in).next();
            System.out.print("\t请输入新货物的单价：");
            h.price = new Scanner(System.in).nextDouble();
            lists.add(h);
        }
    }
    public static void deleteThing(ArrayList<huoList> lists) {
            System.out.println("删除货物");
            System.out.println("请输入您想删除的货物编号：");
            int num = new Scanner(System.in).nextInt();
            for (int j = 0 ;j < lists.size(); j++){
                huoList h = lists.get(j);
                if (h.bianhao == num){
                    lists.remove(h);
                }
            }
    }
    public static void changeThing(ArrayList<huoList> lists){
        System.out.println("修改货物");
        System.out.println("请输入您想修改的货物编号：");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0;i < 1;i++){
            huoList h = new huoList();
            System.out.print("\t请输入新的货物编号：");
            h.bianhao = new Scanner(System.in).nextInt();
            System.out.print("\t请输入新的货物名称：");
            h.mingcheng = new Scanner(System.in).next();
            System.out.print("\t请输入新的货物单价：");
            h.price = new Scanner(System.in).nextDouble();
            for (int j = 0 ;j < lists.size(); j++){
                huoList m = lists.get(j);
                if (m.bianhao == num){
                    lists.set(j,h);
                }
            }
        }
    }
}

package GameDemo;

import java.util.*;

public class Room {
    //1、准备好54张牌，给房间使用：定义一个集合容器装54张牌
    private final List<Card> allCards = new ArrayList<>();

    //初始化54张牌
    {
        int i = 12;
        //准备花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        //准备点数
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String color : colors) {
            for (String number : numbers) {
                Card card = new Card(color, number, i );
                allCards.add(card);
                i++;
                if(i > 13) i = 1;
            }
        }
        allCards.add(new Card("🫅", "",53));
        allCards.add(new Card("🤴", "",54));
        System.out.println("新牌是：" + allCards);
    }

    public void start() {
        //洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);
        //发牌
        //定义3个玩家
        Map<String, List<Card>> players = new HashMap<>();
        List<Card> p1_card = new ArrayList<>();
        players.put("p1", p1_card);
        List<Card> p2_card = new ArrayList<>();
        players.put("p2", p2_card);
        List<Card> p3_card = new ArrayList<>();
        players.put("p3", p3_card);

        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            if (i % 3 == 0) {
                p1_card.add(card);
            } else if (i % 3 == 1) {
                p2_card.add(card);
            } else {
                p3_card.add(card);
            }
        }
        //最后3张牌给底牌
        List<Card> bottom_card = allCards.subList(allCards.size() - 3, allCards.size());
        //底牌是
        System.out.println("底牌是：" + bottom_card);
        p3_card.addAll(bottom_card);

        //对玩家手中的牌进行排序
        sortCards(p1_card);
        sortCards(p2_card);
        sortCards(p3_card);
        //玩家手里的牌
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    private void sortCards(List<Card> p3Card) {
        Collections.sort(p3Card, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSizeNum()-o2.getSizeNum();
            }
        });


    }
}

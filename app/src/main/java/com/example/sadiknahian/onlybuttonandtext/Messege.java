package com.example.sadiknahian.onlybuttonandtext;

import java.util.Random;

public class Messege {

    String[] techTips = new String[]{
            "Your Tech tips > 1",
            "Your Tech tips > 2",
            "Your Tech tips > 3",
            "Your Tech tips > 4",
            "Your Tech tips > 5",
            "Your Tech tips > 6",
            "Your Tech tips > 7"
    };
    String[] foodTips = new String[]{
            "Your Food tips > 1",
            "Your Food tips > 2",
            "Your Food tips > 3",
            "Your Food tips > 4",
            "Your Food tips > 5",
            "Your Food tips > 6",
            "Your Food tips > 7"
    };
    String[] fitnesstips = new String[]{
            "Your Fitness tips > 1",
            "Your Fitness tips > 2",
            "Your Fitness tips > 3",
            "Your Fitness tips > 4",
            "Your Fitness tips > 5",
            "Your Fitness tips > 6",
            "Your Fitness tips > 7"
    };
    String[] randomTips = new String[]{
            "Your Random tips > 1",
            "Your Random tips > 2",
            "Your Random tips > 3",
            "Your Random tips > 4",
            "Your Random tips > 5",
            "Your Random tips > 6",
            "Your Random tips > 7"
    };

    String[] backgroundColor =new String[]{
            "#DB0684",
            "#DB8006",
            "#CEDB06",
            "#5DDB06",
            "#06DB33",
            "#06B4DB",
            "#9706DB"
    };


    public String getMsg(String tipType)
    {
        String tips = "";
        int i = new Random().nextInt(7);
        switch (tipType)
        {
            case "random":
                int j = new Random().nextInt(4);
                switch(j)
                {
                    case 0:
                        tips = randomTips[i];
                        break;
                    case 1:
                        tips = techTips[i];
                        break;
                    case 2:
                        tips = foodTips[i];
                        break;
                    case 3:
                        tips = fitnesstips[i];
                        break;
                }
                break;
            case "fitness":
                tips = fitnesstips[i];
                break;
            case "food":
                tips = foodTips[i];
                break;
            case "tech":
                tips = techTips[i];
                break;
            default:
                tips = randomTips[i];
                break;
        }
        return tips;
    }

    public String getBackgroundColor() {
        int i = new Random().nextInt(7);
        return backgroundColor[i];
    }
}

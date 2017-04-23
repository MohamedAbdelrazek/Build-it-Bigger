package com.example;

import java.util.Random;

public class Joker {
    private Random random = new Random();

    public String getJoke() {
        String joke;
        switch (random.nextInt(20)) {
            case 0:
                joke = "Harry prays to God: Dear Lord, please make me win the lottery. \n" +
                        "\n" +
                        "The next day Harry begs the Lord again: Please make it so I win the lottery, Lord! \n" +
                        "\n" +
                        "The next day, Harry again prays: Please, please, dear Lord, make me win the lottery! \n" +
                        "\n" +
                        "Suddenly he hears a voice from above: Harry, would you kindly go and buy a lottery ticket";
                break;
            case 1:
                joke = "Little Johnny once bought his Grandma a very nice, luxurious toilet brush for her birthday. But when he went to visit her a couple of weeks later, it wasn't in the bathroom. \n" +
                        "\n" +
                        "Little Johnny asked his Grandma, “Gran, what happened to the toilet brush I gave you?”\n" +
                        "\n" +
                        "“Darling, I'm sorry but I just didn’t like it. It was too scratchy. After all those years, I’ve gotten used to the toilet paper.\n";
                break;
            case 2:
                joke = "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.";
                break;
            case 3:
                joke = "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.";
                break;
            case 4:
                joke = "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                        "\n" +
                        "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                        "\n" +
                        "Doctor: \"Nine.\"";
                break;
            case 5:
                joke = "A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.”\n" +
                        "\n" +
                        "The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.”";
                break;
            case 6:
                joke = "Anton, do you think I’m a bad mother?\n" +
                        "\n" +
                        "My name is Paul.\n";
                break;
            case 7:
                joke = "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.";
                break;
            case 8:
                joke = "What is the difference between a snowman and a snowwoman?\n" +
                        "-\n" +
                        "Snowballs";
                break;
            case 9:
                joke = "Mother: \"How was school today, Patrick?\"\n" +
                        "\n" +
                        "Patrick: \"It was really great mum! Today we made explosives!\"\n" +
                        "\n" +
                        "Mother: \"Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?\"\n" +
                        "\n" +
                        "Patrick: \"What school?";
                break;
            case 10:
                joke = "Mom, where do tampons go?\"\n" +
                        "\n" +
                        "\"Where the babies come from, darling.\"\n" +
                        "\n" +
                        "\"In the stork?";
                break;
            case 11:
                joke = "Dentist: \"You need a crown.\"\n" +
                        "-\n" +
                        "Patient: \"Finally someone who understands me.";
                break;
            case 12:
                joke = "Two flies are sitting on a pile of dog poop. One suggests to the other: “Do you want to hear a really good joke?”\n" +
                        "\n" +
                        "The other fly replies: “But nothing disgusting like last time, I’m trying to eat here!";
                break;
            case 13:
                joke = "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!";
                break;
            case 14:
                joke = "A wife goes to consult a psychiatrist about her husband: “My husband is acting so weird. He drinks his morning coffee and then he goes and eats the mug! He only leaves the handle!”\n" +
                        " \n" +
                        "Psychiatrist: “Yes, that is weird. The handle is the best part.";
                break;
            case 15:
                joke = "I heard women love a man in uniform. Can’t wait to start working at McDonalds.";
                break;
            case 16:
                joke = "Oh darling, since you’ve started dieting, you’ve become such a passionate kisser…\n" +
                        "\n" +
                        "What do you mean, passionate? I’m looking for food remains!";
                break;
            case 17:
                joke = "Police officer: \"Can you identify yourself, sir?\"\n" +
                        " \n" +
                        "Driver pulls out his mirror and says: \"Yes, it's me";
                break;
            case 18:
                joke = "Some nice Chinese couple gave me a very good camera down by the Washington Monument. I didn’t really understand what they were saying, but it was very nice of them.";
                break;
            case 19:
                joke = "In Spain, there is a tradition after a bullfight to serve the mayor the bull’s testicles.\n" +
                        "-\n" +
                        "One day after a bullfight, the mayor asks the waiter: “Funny, why are they so small today?”\n" +
                        "-\n" +
                        "The waiter: “Today, sir, the bull won.";
                break;
            default:
                joke = "What do you get when you cross-breed a cow and a shark? \n" +
                        " \n" +
                        "I don’t know, but I wouldn't enjoy milking it.";
                break;
        }
        return joke;
    }
}

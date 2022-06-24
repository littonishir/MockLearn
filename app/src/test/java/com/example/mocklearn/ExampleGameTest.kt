package com.example.mocklearn

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleGameTest {
    @Test
    fun addition_isCorrect() {
        val s = "起初知道Switch还是在2021年11月份，Switch都问世五年了那是我第一次知道，像个土老帽一样，一副没见过世面的样子。我去京东看了看价格。emmmmm，感觉有点贵呀2000多想想还是算了。这时候其实我每月工资已经差不多有两万了，还是像小时候口袋只有5毛钱那样扣扣搜搜的。买switch这个事暂时就搁置了。\n" +
                "还记得十几年前我曾经有一个小霸王学习机（游戏机），那是我妈买给我让我练习打字的，说是这和电脑上打字是一样的，让我多练练，以后用电脑也能更好上手，那年大概是1998年，我第一次知道有电脑这种东西。我们说回我的小霸王，我确实练过一段时间的五笔，直到现在五笔字根表我也是信手拈来，比如：王旁青头戋五一、土士二干十寸雨、大犬三（羊）古石厂、木丁西、工戈草头右框七 ...\n" +
                "\n" +"最后的结果肯能大家也猜到了，我能把Switch和小霸王联想到一起那就说明在我眼里这就是游戏机。"
                "打字说实话也打过，就是后来被我完成了游戏机，那时候我跟我的好朋友们一起打游戏，我们玩过很多游戏卡，玩累了挤在一个一米五的单人床上睡觉，那时的我们无忧无滤、烂漫天真、没有钱、也没有远大的理想。那时候唯一担心的可能是今天的作业做没做完。我们一无所有，我们无比快乐。\n" +
                "那时候奶奶还健在，半夜透过黑白电视机发出的光亮，操着一口正宗的山东话吼我们“咋着还不费哎，都几点啦！赶紧里把电视关行费叫，赶紧里”\n" +
                "\n"
        assertEquals(4, 2 + 2)
    }
}
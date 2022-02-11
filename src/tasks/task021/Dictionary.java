package tasks.task021;

public class Dictionary {

    public static void buildDictionary(String text){

        text = text.toLowerCase();

        int[] result = new int['я' - 'а' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }
    }

    public static void main(String[] args){
        String s = "Лишь некоторые особенности внутренней политики, превозмогая сложившуюся непростую экономическую ситуацию, объединены в целые кластеры себе подобных! Сложно сказать, почему диаграммы связей представляют собой не что иное, как квинтэссенцию победы маркетинга над разумом и должны быть рассмотрены исключительно в разрезе маркетинговых и финансовых предпосылок. Безусловно, внедрение современных методик выявляет срочную потребность анализа существующих паттернов поведения.";

        buildDictionary(s);
        System.out.println(s);
    }
}

public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    public static String lowerCase(String str) {
        int lenth = str.length();
        String newStr = "";
        for (int i = 0; i < lenth; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                newStr = newStr + (char) (str.charAt(i) + 32);
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                newStr = newStr + (str.charAt(i));
            } else {
                newStr = newStr + (str.charAt(i));
            }
        }
        return newStr;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

       String [] originalSentences = sentences;
        for (int i = 0 ; i < sentences.length; i++) {
            sentences [i] = lowerCase(sentences [i]);
            }

        for (int j = 0; j < keywords.length; j++) {

            for(int t = 0; t <sentences.length; t++) {
                if (sentences [t] == keywords[j]) {
                    System.out.println(originalSentences);
                    break;
                }
            }
        }
    }
}

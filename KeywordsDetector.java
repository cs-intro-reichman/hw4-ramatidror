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

    public static boolean contains(String str1, String str2) {

        if (str2.length() > str1.length()) {
            return false;
        } else if (str2.length() == 0) {
            return true;
        }
        else {
            for (int i = 0; i <= (str1.length() - str2.length()); i++) {
                boolean match = true;

                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i + j) != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
            return false;
        }
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        String[] originalSentences = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            originalSentences[i] = sentences[i];
        }

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = lowerCase(sentences[i]);
        }

        for (int i = 0; i < keywords.length; i++) {
            keywords[i] = lowerCase(keywords[i]);
        }

        for (int j = 0; j < originalSentences.length; j++) {

            for (int t = 0; t < keywords.length; t++) {
                if (contains(sentences[j], keywords[t])) {
                    System.out.println(originalSentences[j]);
                    break;
                }

            }
        }
    }
}

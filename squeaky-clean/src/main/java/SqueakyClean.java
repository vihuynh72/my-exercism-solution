import java.util.List;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean kebabCaseIdenticator = false;
        List<Character> leetspeak = List.of('4', '3', '0', '1', '7');
        
        for (char c : identifier.toCharArray()) {
            if (c == ' ') {
                builder.append('_');
            } else if (c == '-') {
                kebabCaseIdenticator = true;
            } else if (leetspeak.contains(c)) {
                switch (c) {
                    case '4':
                        builder.append('a');
                        break;
                    case '3':
                        builder.append('e');
                        break;
                    case '0':
                        builder.append('o');
                        break;
                    case '1':
                        builder.append('l');
                        break;
                    case '7':
                        builder.append('t');
                        break;
                    default:
                        break;
                }
            } else {
                if (Character.isLetter(c)) {
                    if (kebabCaseIdenticator) {
                        builder.append(Character.toUpperCase(c));
                        kebabCaseIdenticator = false;
                    } else {
                        builder.append(c);
                    }
                }
            }
        }

        String cleanString = builder.toString();
        return cleanString;
    }
}

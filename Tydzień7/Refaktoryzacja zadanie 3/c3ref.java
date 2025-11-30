class StringComparison {
    static boolean isSameString(String s1, String s2) {
        if (s1 == s2)
            return true;
        if (s1 == null)
            return false;
        return s1.equals(s2);
    }
}

class Order {
    // Używa: StringComparison.isSameString(s1, s2)
}

class Mail {
    // Używa: StringComparison.isSameString(s1, s2)
}
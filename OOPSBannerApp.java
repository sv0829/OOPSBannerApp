class OOPSBanner {

    public static void main(String[] args) {

        // Inline array initialization using String.join()
        String[] bannerLines = {
            String.join("", " *****  ", " *****  ", " *****  ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*      "),
            String.join("", "*     * ", "*     * ", "*     * ", "*      "),
            String.join("", "*     * ", "*     * ", " *****  ", " ***** "),
            String.join("", "*     * ", "*     * ", "*       ", "      *"),
            String.join("", "*     * ", "*     * ", "*       ", "      *"),
            String.join("", " *****  ", " *****  ", "*       ", " *****")
        };

        // Enhanced for-loop to display banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
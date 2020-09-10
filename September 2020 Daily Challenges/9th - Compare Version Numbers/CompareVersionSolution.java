public class CompareVersionSolution {
    public static int compareVersion(String version1, String version2) {

        // Split version strings up into there parts
        String[] versionOneBreakDown = version1.split("\\.");
        String[] versionTwoBreakDown = version2.split("\\.");

        int shortestLength;
        if(versionOneBreakDown.length > versionTwoBreakDown.length){
            shortestLength = version2.length();
        } else {
            shortestLength = version1.length();
        }

        for (int i = 0; i < shortestLength; i++) {
            Integer v1 = Integer.parseInt(versionOneBreakDown[i]);
            Integer v2 = Integer.parseInt(versionTwoBreakDown[i]);

            if(v1 > v2){
                return 1;
            }else if (v1 < v2){
                return -1;
            }
        }

        return 0;
    }
}

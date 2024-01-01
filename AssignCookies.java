/* https://leetcode.com/problems/assign-cookies/submissions/?envType=daily-question&envId=2024-01-01 */
/* 455. Assign Cookies */

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int i = 0;
    for (int j = 0; i < g.length && j < s.length; ++j)
      if (g[i] <= s[j])
        ++i;

    return i;
    }
}

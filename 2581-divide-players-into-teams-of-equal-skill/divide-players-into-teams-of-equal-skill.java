import java.util.*;
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left=0;
        int right=skill.length-1;
        int teamSkill = skill[left] + skill[right];
        long chemistry = 0;
       
        while (left < right) {
            if (skill[left] + skill[right] != teamSkill) {
                return -1;
            }

            chemistry += (long) skill[left] * skill[right];

            left++;
            right--;
        }

        return chemistry;
        }
         
    }

package uwotm8;

public final class SkillsConstants
{
    public static final String[] SKILL_NAMES;
    public static final boolean[] SKILL_TOGGLES;
    
    static {
        SKILL_NAMES = new String[] { "attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "farming", "runecraft", "hunter", "construction", "-unused-", "-unused-" };
        SKILL_TOGGLES = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
    }
}

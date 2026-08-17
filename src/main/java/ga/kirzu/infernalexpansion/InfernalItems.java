package ga.kirzu.infernalexpansion;

import ga.kirzu.infernalexpansion.items.runes.BedRune;
import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItemStack;
import com.github.drakescraft_labs.slimefun4.utils.LoreBuilder;
import com.github.drakescraft_labs.slimefun4.utils.itemstack.ColoredFireworkStar;
import org.bukkit.Color;
import org.bukkit.Material;

public class InfernalItems {

    public static final SlimefunItemStack THERMAL_WALK_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_THERMAL_WALK", new ColoredFireworkStar(Color.fromRGB(166, 27, 27), "&7runas antiguas &8&l[&c&lCaminante de magma&8&l]", "&eLanza esta runa en las botas como gota.", "&eSe puede encantar con el efecto caminante de magma.", "", "&eEste encantamiento convierte la lava circundante en obsidiana.", "&eY hace que el usuario sea inmune al daño del fuego."));
    public static final SlimefunItemStack BED_RUNE
            = new SlimefunItemStack("ANCIENT_RUNE_BED", new ColoredFireworkStar(Color.fromRGB(255, 123, 0), "&7runas antiguas &8&l[&6&lcama&8&l]", "&eTira esta runa sobre la cama.", "&epara aumentar su radio de explosión", "", LoreBuilder.usesLeft(BedRune.USES)));

    public static final SlimefunItemStack PORTABLE_NETHER_TELEPORTER
            = new SlimefunItemStack("PORTABLE_NETHER_TELEPORTER", Material.NETHER_STAR, "&dTeletransportador inferior portátil", "", "&fTeletransportarte al Nether desde cualquier ubicación", "", LoreBuilder.powerCharged(0, 250), "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack PYROMANIAC_BLAZE_ROD
            = new SlimefunItemStack("PYROMANIAC_BLAZE_ROD", Material.BLAZE_ROD, "&6Palo ardiente del pirómano", "", "&fPrender fuego alrededor5bloques dentro del radio de la cuadrícula", "", LoreBuilder.powerCharged(0, 200), "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack FIREBALL_LAUNCHER
            = new SlimefunItemStack("FIREBALL_LAUNCHER", Material.FIRE_CHARGE, "&6lanzador de bolas de fuego", "", "&fDispara una bola de fuego directamente frente a ti.", "", LoreBuilder.powerCharged(0, 250), "", LoreBuilder.RIGHT_CLICK_TO_USE);

    public static final SlimefunItemStack PIGLIN_TALISMAN
            = new SlimefunItemStack("PIGLIN_TALISMAN", Material.EMERALD, "&aAmuleto Piglin", "", "&fCuando tienes este amuleto en tu mochila", "&fLos piglins zombies ya no te odiarán");

    public static final SlimefunItemStack PIGLIN_ATTRACTOR
            = new SlimefunItemStack("PIGLIN_ATTRACTOR", Material.RESPAWN_ANCHOR, "&eAtractor Piglin", "", "&fMientras carga", "&fAtrae a los piglins zombis cercanos.", "", LoreBuilder.powerBuffer(2_000), LoreBuilder.powerPerSecond(25));

}
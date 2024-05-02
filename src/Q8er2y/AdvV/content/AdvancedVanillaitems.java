package AdvancedVanilla.content;

import arc.graphics.*;
import arc.struct.Seq;
import q8er2y.javaav.AVMod;
import AdvancedVanilla.graphics.*;
import mindustry.type.Item;

import static mindustry.content.Items.*;

public class AdvancedVanillaItems {
    public static Item titaniumCluster;

    public static Seq<Item> serpuloItems = new Seq<>(),

    public static void load(){
        titaniumCluster = new Item("Titanium-Cluster", Color.valueOf("3d7fa1")){{
            hardness = 3;
            cost = 1f;
        }};
       
            @Override
            public void loadIcon(){
  
            }
        };
serpuloItems.addAll(titaniumCluster);
    }
}

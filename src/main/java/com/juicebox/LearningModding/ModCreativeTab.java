package com.juicebox.LearningModding;

import com.juicebox.LearningModding.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Juicebox on 25/06/2015.
 * For LearningModding at https://github.com/xlogisticzz/LearningModding
 * Licensed under GNU GENERAL PUBLIC LICENSE
 */

public class ModCreativeTab {

    public static CreativeTabs tabLearningModding = new CreativeTabs("tabLearningModding") {
        @Override
        public Item getTabIconItem() {
            return ModItems.ruby;
        }
    };
}

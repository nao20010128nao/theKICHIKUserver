package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockGold
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.Utils

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellGold extends BlockGold{
    LemiHellGold(int meta=0){super(meta)}

    @Override
    int[][] getDrops(Item item) {
        Utils.createJewelryBlockDrops(item,ItemTool.TIER_IRON,Item.GOLD_INGOT)
    }
}

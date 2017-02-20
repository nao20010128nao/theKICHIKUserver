package com.nao20010128nao.Fiendish.blocks

import cn.nukkit.block.BlockEmerald
import cn.nukkit.item.Item
import cn.nukkit.item.ItemTool
import com.nao20010128nao.Fiendish.PhpMethods

/**
 * Created by nao on 2017/02/20.
 */
class LemiHellEmerald extends BlockEmerald{
    @Override
    int[][] getDrops(Item item) {
        if(item.tier>= ItemTool.TIER_IRON){
            def rand=PhpMethods.mt_rand(0,9)
            def data
            switch(rand){
                case 9:
                    data=[Item.EMERALD_BLOCK,0,1]
                    break
                default:
                    data=[Item.EMERALD,0,rand]
                    break
            }
            return [data]
        }else{
            return []
        }
    }
}
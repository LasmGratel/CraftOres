package tk.gratelteam.orecraft;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
@Mod(modid="OreCraft",name="OreCraft")
public class OreCraft {
	
	@EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
            // Stub Method
    }
    
    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
            ItemStack iron=new ItemStack(Blocks.iron_ore,16);
            ItemStack gold=new ItemStack(Blocks.gold_ore,16);
            ItemStack stone=new ItemStack(Blocks.cobblestone,16);
            ItemStack coal=new ItemStack(Blocks.coal_block,16);
            ItemStack diamond=new ItemStack(Blocks.diamond_ore,16);
            ItemStack lapis=new ItemStack(Blocks.lapis_ore,16);
            ItemStack emerald=new ItemStack(Blocks.emerald_ore,16);
            GameRegistry.addRecipe(iron,"xx ","   ","   ",'x',stone);
            GameRegistry.addRecipe(gold,"x x","   ","   ",'x',stone);
            GameRegistry.addRecipe(coal,"xxx","   ","   ",'x',stone);
            GameRegistry.addRecipe(diamond,"x  ","x  ","   ",'x',stone);
            GameRegistry.addRecipe(lapis,"xx ","x  ","   ",'x',stone);
            GameRegistry.addRecipe(emerald,"xxx","x  ","   ",'x',stone);
            
    }
    
    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}

package LeadFreeCandy.examplemod.items;


import LeadFreeCandy.examplemod.TutorialMod;
import LeadFreeCandy.examplemod.init.ModItems;
import LeadFreeCandy.registration.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);

    }
    @Override
    public void registerModels() {

        //Main.proxy.registerItemRenderer(this, 0, "inventory");

        TutorialMod.serverProxy.registerItemRenderer(this, 0, "inventory");



    }
}

//test e

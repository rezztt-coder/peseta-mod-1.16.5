
package net.mcreator.pesetamod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.pesetamod.itemgroup.PesetaModItemGroup;
import net.mcreator.pesetamod.PesetamodModElements;

import java.util.List;

@PesetamodModElements.ModElement.Tag
public class DuroItem extends PesetamodModElements.ModElement {
	@ObjectHolder("pesetamod:duro")
	public static final Item block = null;

	public DuroItem(PesetamodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PesetaModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("duro");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Cambialo a Pesetas para jugar"));
		}
	}
}

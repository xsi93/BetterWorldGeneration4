package bwg4.api.gen;

import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import bwg4.api.biome.BiomeList;
import bwg4.world.ProviderBWG4;
import bwg4.world.generators.ChunkGeneratorAlpha;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class GeneratorTypeAlpha11 extends GeneratorType
{
	public GeneratorTypeAlpha11(int id, int cat, String name, String screen, boolean c, boolean s) 
	{
		super(id, cat, name, screen, c, s);
	}
	
	@Override
	public WorldChunkManager getServerWorldChunkManager(ProviderBWG4 provider, World worldObj)
    {
		if(provider.trySetting(0, 1) == 0) 
		{ 
			return new WorldChunkManagerHell(BiomeList.CLASSICnormal, 0.5F); 
		}
		return new WorldChunkManagerHell(BiomeList.CLASSICsnow, 0.5F); 
    }

	@Override
	public WorldChunkManager getClientWorldChunkManager(ProviderBWG4 provider)
    {
		return new WorldChunkManagerHell(BiomeList.CLASSICnormal, 0.5F);
    }

	@Override
    public IChunkProvider getChunkGenerator(ProviderBWG4 provider, World worldObj)
    {	
		return new ChunkGeneratorAlpha(worldObj, worldObj.getSeed(), worldObj.getWorldInfo().isMapFeaturesEnabled());
    }

	@Override
    public boolean getRandSpawn(ProviderBWG4 provider)
    {
    	return true;
    }

	@Override
    public float getCalculateCelestialAngle(ProviderBWG4 provider, long par1, float par3)
    {
    	return 0F;
    }

	@Override
    public boolean isSurfaceWorld(ProviderBWG4 provider)
    {
    	return true;
    }

	@Override
    public Vec3 getFogColor(ProviderBWG4 provider, World worldObj, float par1, float par2)
    {
    	return null;
    }

	@Override
    public float getCloudHeight(ProviderBWG4 provider)
    {
    	return 128F;
    }

	@Override
    public int getAverageGroundLevel(ProviderBWG4 provider)
    {
    	return 64;
    }

	@Override
    public double getHorizon(ProviderBWG4 provider)
    {
    	return 64D;
    }

	@Override
    public boolean getWorldHasVoidParticles(ProviderBWG4 provider)
    {
    	return true;
    }
}

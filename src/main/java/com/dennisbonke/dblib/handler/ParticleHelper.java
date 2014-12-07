package com.dennisbonke.dblib.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

import java.awt.*;
import java.util.Random;

public class ParticleHelper {
    World world;
    Random rand;
    boolean Spawn;

    public ParticleHelper(World world, boolean ConfigSpawn){

        this.world = world;
        rand = new Random();
        Spawn = ConfigSpawn;
    }

    public void SpawnParticle(String particleName, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed){

        if(Spawn){
            world.spawnParticle(particleName, x, y, z, xSpeed, ySpeed, zSpeed);
        }
    }


    public void SpawnParticleAroundBlock(String Name, double x, double y, double z, double rn){
        float f1 = (float) y + 0.6F + rand.nextFloat() * 6.0F / 16.0F;
        double remove = rn - 0.2;

        SpawnParticle(Name, (x + (rand.nextFloat() - remove)),f1,(z + (rand.nextFloat() - remove)), 0,0,0);

    }


    public void SpawnParticleRandomDrWithCol(EntityFX fx, double width, double height, int amount, Color c){
        if(Spawn) {
            if(world.isRemote)
                for (int i = 0; i < amount; ++i) {
                    double d0 = rand.nextGaussian() * 0.02D;
                    double d1 = rand.nextGaussian() * 0.02D;
                    double d2 = rand.nextGaussian() * 0.02D;

                    fx.posX = fx.posX +  (this.rand.nextFloat() * width * 2.0F) - width;
                    fx.posY = fx.posY +  1.0D +  (this.rand.nextFloat() * width);
                    fx.posZ = fx.posZ + (this.rand.nextFloat() * width * 2.0F) -  width;

                    fx.motionX = d0;
                    fx.motionY = d1;
                    fx.motionZ = d2;

                    fx.setRBGColorF(((float)c.getRed() / (float)255), ((float)c.getGreen() / (float)255), ((float)c.getBlue() / (float)255));

                    Minecraft.getMinecraft().effectRenderer.addEffect(fx);
                }

        }
    }




    public void SpawnParticleRandomDr(String Name, double x, double y, double z, double width, int amount){
        for (int i = 0; i < amount; ++i) {
            double d0 = rand.nextGaussian() * 0.02D;
            double d1 = rand.nextGaussian() * 0.02D;
            double d2 = rand.nextGaussian() * 0.02D;
            SpawnParticle(Name, x + (double) (this.rand.nextFloat() * width * 2.0F) - (double) width, y + 1.0D + (double) (this.rand.nextFloat() * width), z + (double) (this.rand.nextFloat() * width * 2.0F) - (double) width, d0, d1, d2);
        }

    }
}

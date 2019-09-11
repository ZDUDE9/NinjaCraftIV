package ninjacraft.mod.objects.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCustomArmor - 
 * Created using Tabula 7.0.0
 */
public class ModelDragonArmor extends ModelBiped {
    public ModelRenderer BrimLeft;
    public ModelRenderer BrimRight;
    public ModelRenderer BrimFront;
    public ModelRenderer BrimRear;
    public ModelRenderer Fifth;
    public ModelRenderer Fourth;
    public ModelRenderer AFeather;
    public ModelRenderer Third;
    public ModelRenderer Second;
    public ModelRenderer First;

    public ModelDragonArmor() {
        this.textureWidth = 230;
        this.textureHeight = 128;
        this.BrimLeft = new ModelRenderer(this, 178, 114);
        this.BrimLeft.setRotationPoint(1.0F, -6.0F, 0.0F);
        this.BrimLeft.addBox(-6.5F, 0.0F, -6.5F, 13, 1, 1, 0.0F);
        this.setRotateAngle(BrimLeft, 0.0F, -1.5707963267948966F, 0.0F);
        this.Third = new ModelRenderer(this, 137, 112);
        this.Third.setRotationPoint(0.0F, -9.0F, 0.0F);
        this.Third.addBox(-4.0F, 0.0F, -4.0F, 8, 1, 8, 0.0F);
        this.Fifth = new ModelRenderer(this, 172, 88);
        this.Fifth.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Fifth.addBox(-6.5F, 0.0F, -6.5F, 13, 1, 13, 0.0F);
        this.AFeather = new ModelRenderer(this, 158, 75);
        this.AFeather.setRotationPoint(-0.3F, -10.0F, 0.8F);
        this.AFeather.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 0, 0.0F);
        this.setRotateAngle(AFeather, 0.0F, 1.4114477660878142F, 0.0F);
        this.BrimRight = new ModelRenderer(this, 178, 114);
        this.BrimRight.setRotationPoint(-1.0F, -6.0F, 0.0F);
        this.BrimRight.addBox(-6.5F, 0.0F, -6.5F, 13, 1, 1, 0.0F);
        this.setRotateAngle(BrimRight, 0.0F, 1.5707963267948966F, 0.0F);
        this.BrimFront = new ModelRenderer(this, 178, 114);
        this.BrimFront.setRotationPoint(0.0F, -6.0F, -1.0F);
        this.BrimFront.addBox(-6.5F, 0.0F, -6.5F, 13, 1, 1, 0.0F);
        this.Fourth = new ModelRenderer(this, 123, 95);
        this.Fourth.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Fourth.addBox(-5.5F, 0.0F, -5.5F, 11, 1, 11, 0.0F);
        this.Second = new ModelRenderer(this, 144, 83);
        this.Second.setRotationPoint(0.0F, -9.5F, 0.0F);
        this.Second.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4, 0.0F);
        this.BrimRear = new ModelRenderer(this, 178, 114);
        this.BrimRear.setRotationPoint(0.0F, -6.0F, 1.0F);
        this.BrimRear.addBox(-6.5F, 0.0F, -6.5F, 13, 1, 1, 0.0F);
        this.setRotateAngle(BrimRear, 0.0F, 3.141592653589793F, 0.0F);
        this.First = new ModelRenderer(this, 144, 75);
        this.First.setRotationPoint(0.0F, -10.2F, 0.0F);
        this.First.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.bipedHead.addChild(First);
        this.bipedHead.addChild(Second);
        this.bipedHead.addChild(Third);
        this.bipedHead.addChild(Fourth);
        this.bipedHead.addChild(Fifth);
        this.bipedHead.addChild(BrimRear);
        this.bipedHead.addChild(BrimFront);
        this.bipedHead.addChild(BrimRight);
        this.bipedHead.addChild(BrimLeft);
        this.bipedHead.addChild(AFeather);
        
    
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 

    	super.render(entity, f, f1, f2, f3, f4, f5);
    	
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

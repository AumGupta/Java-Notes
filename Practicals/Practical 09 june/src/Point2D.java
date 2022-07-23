 class Point2D
 {
    private float x = 0.0f;
    private float y = 0.0f;
    
    public Point2D(){};

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    };
    
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float[] getXY(){
        float[] coordinates = new float[2];
        coordinates[0] = x;
        coordinates[1] = y;
        return coordinates;
    }
    
    public void setX(float x){
        this.x = x;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;    
    }
    
    public String toString(){
        return "("+x+", "+y+")";
    }
}

class Point3D extends Point2D
{
    private float z = 0.0f;
    
    public Point3D(){}
    
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ(){
        return z;
    }

    public void setZ(float z){
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] coordinates = new float[3];
        coordinates[0] = getX();
        coordinates[1] = getY();
        coordinates[2] = z;
        return coordinates;
    }
    
    public String toString(){
        return "("+getX()+", "+getY()+", "+z+")";
    }
}
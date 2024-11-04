//Types of Interface
/*
 * Inter face is of three types itself...
 * - Normal Interface (A interface having multiple unimplemented methods itself)
 * - Functional Interface / SAM (SAM - Single Abstract Methods) - Interface having single unimplemented method itself..
 * - Marker Interface - A interface which has no methods into it.
 * 
 * The reason behind creating an Marker Interface is -
 *    to update something to the compiler.
 *      In java we are having the concept of serilization...it means you can take the object and store it to the harddrive...
 * let say in our heap memory we are having an object which has some variable itself which has some values we can store it to the hardsrive
 * and destroy the object...its known as serilization, again when you need that values you can simply store that values of that variables to its object from the harddrive... This concepts is known as deserilization...
 * By default every object does not allow to do this, for that we need to take the permission...
 * To give the permission we can simply create an class and we can give the permission with the help of marker Interface...
 */
public class TypesOfInterface {
    
}

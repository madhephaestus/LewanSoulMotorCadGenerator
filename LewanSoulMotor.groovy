import com.neuronrobotics.bowlerstudio.vitamins.Vitamins

import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube
import eu.mihosoft.vrl.v3d.parametrics.*;
CSG generate(){
	String type= "LewanSoulMotor"
	if(args==null)
		args=["lx_224"]
	// The variable that stores the current size of this vitamin
	StringParameter size = new StringParameter(	type+" Default",args.get(0),Vitamins.listVitaminSizes(type))
	HashMap<String,Object> measurments = Vitamins.getConfiguration( type,size.getStrValue())

	def MaxTorqueNewtonmetersValue = measurments.MaxTorqueNewtonmeters
	def topHoleCornerInsetValue = measurments.topHoleCornerInset
	def topHoleCircleDiameterValue = measurments.topHoleCircleDiameter
	def massCentroidYValue = measurments.massCentroidY
	def massCentroidXValue = measurments.massCentroidX
	def shoulderDiameterValue = measurments.shoulderDiameter
	def sourceValue = measurments.source
	def massCentroidZValue = measurments.massCentroidZ
	def cable_xValue = measurments.cable_x
	def caseHoleDiameterValue = measurments.caseHoleDiameter
	def bottomSquareMountHoleSizeValue = measurments.bottomSquareMountHoleSize
	def priceValue = measurments.price
	def shaftSizeValue = measurments.shaftSize
	def shaftTypeValue = measurments.shaftType
	def MaxFreeSpeedRadPerSecValue = measurments.MaxFreeSpeedRadPerSec
	def body_yValue = measurments.body_y
	def body_zValue = measurments.body_z
	def massKgValue = measurments.massKg
	def body_xValue = measurments.body_x
	def shoulderHeightValue = measurments.shoulderHeight
	def bottomHoleDistanceFromCornerValue = measurments.bottomHoleDistanceFromCorner
	def cable_zValue = measurments.cable_z
//	println "Measurment MaxTorqueNewtonmetersValue =  "+MaxTorqueNewtonmetersValue
//	println "Measurment topHoleCornerInsetValue =  "+topHoleCornerInsetValue
//	println "Measurment topHoleCircleDiameterValue =  "+topHoleCircleDiameterValue
//	println "Measurment massCentroidYValue =  "+massCentroidYValue
//	println "Measurment massCentroidXValue =  "+massCentroidXValue
//	println "Measurment shoulderDiameterValue =  "+shoulderDiameterValue
//	println "Measurment sourceValue =  "+sourceValue
//	println "Measurment massCentroidZValue =  "+massCentroidZValue
//	println "Measurment cable_xValue =  "+cable_xValue
//	println "Measurment caseHoleDiameterValue =  "+caseHoleDiameterValue
//	println "Measurment bottomSquareMountHoleSizeValue =  "+bottomSquareMountHoleSizeValue
//	println "Measurment priceValue =  "+priceValue
//	println "Measurment shaftSizeValue =  "+shaftSizeValue
//	println "Measurment shaftTypeValue =  "+shaftTypeValue
//	println "Measurment MaxFreeSpeedRadPerSecValue =  "+MaxFreeSpeedRadPerSecValue
//	println "Measurment body_yValue =  "+body_yValue
//	println "Measurment body_zValue =  "+body_zValue
//	println "Measurment massKgValue =  "+massKgValue
//	println "Measurment body_xValue =  "+body_xValue
//	println "Measurment shoulderHeightValue =  "+shoulderHeightValue
//	println "Measurment bottomHoleDistanceFromCornerValue =  "+bottomHoleDistanceFromCornerValue
//	println "Measurment cable_zValue =  "+cable_zValue
	// Stub of a CAD object
	CSG part = new Cube(body_xValue,body_yValue,body_zValue).toCSG()
					.toZMax()
					.toYMax()
					.movey(body_xValue/2)
	
	return part
		.setParameter(size)
		.setRegenerate({generate()})
}
return generate() 
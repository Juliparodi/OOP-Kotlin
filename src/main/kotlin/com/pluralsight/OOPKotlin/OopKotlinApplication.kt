package com.pluralsight.OOPKotlin

import com.pluralsight.OOPKotlin.EnumSealed.ErrorCode
import com.pluralsight.OOPKotlin.EnumSealed.Error
import com.pluralsight.OOPKotlin.EnumSealed.RuntimeError
import com.pluralsight.OOPKotlin.EnumSealed.Season
import com.pluralsight.OOPKotlin.anonymousObject.LoggerImpl
import com.pluralsight.OOPKotlin.anonymousObject.MyMouseListener
import com.pluralsight.OOPKotlin.anonymousObject.UserCompanion
import com.pluralsight.OOPKotlin.anonymousObject.Window
import com.pluralsight.OOPKotlin.entityClasses.Car
import com.pluralsight.OOPKotlin.entityClasses.PersonDataClass
import com.pluralsight.OOPKotlin.generics.Envelope
import com.pluralsight.OOPKotlin.generics.SqlEnvelope
import com.pluralsight.OOPKotlin.valueMembers.Id
import com.pluralsight.OOPKotlin.valueMembers.PersonValueMembers
import module123.*
import module45.Button
import module45.CheckBox
import module45.Clickable
import module45.SerializeJson
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class OopKotlinApplication

fun main(args: Array<String>) {

	//runApplication<OopKotlinApplication>(*args)
    //PERSON section
	val empty = Empty()
	val john = Person()
	john.name = "John"
	john.changeName("Pepe")
	john.feed("Cake")

	println("${john.name} has consumed ${john.calories} calories")
	println("${john.name} has eaten? ${john.hasEaten} calories")

	//PET SECTION
	var dog = Pet()
	var kevin = PetOwner()
	kevin.name = "Kevin"
	println("$kevin.name is owner?")

	val original = "Kevin              with       whitespace"
	val updated = original.replaceMultipleWhitespace()

	println(original)
	println(updated)

	val shulian = PersonWithConstructor("shulian")
	println("${shulian.name} has id ${shulian.id}")
	shulian.initAddress()
	shulian.address

	// MODULE ABSTRACT
	val clickable = Button(1)
	val checkbox: Clickable = CheckBox(3)
	clickSomething(clickable)
	checkbox.click()

	//INTERFACE
	val serializer = SerializeJson()
	val p = module45.Person(serializer)
	p.save()

	//ANONYMOUS OBJECTS
	//object can be used as singleton
	val window = Window()
	window.addWindowListener(MyMouseListener())
	LoggerImpl.warn()

	val mati = UserCompanion.build("Kevin", "Jones")


	//VALUE MEMBERS
	/*
	PRIMITIVE TYPES: Int, String, Char are very efficient but NOT very flexible
	VALUE CLASSES: Are flexible and efficient as primitive types
	 */
	val p1 = PersonValueMembers(Id("1234"), "Juli")


	//DATA CLASSES
	val bmw = Car("BMW", "316")
	val bmw2 = Car("BMW", "316")

	println(bmw)
	println(bmw.hashCode())
	println(bmw2.hashCode())

	if (bmw == bmw2) {
		println("These cars are the same")
	}

	val person1 = PersonDataClass("hello world", "https://hola")
	println("Person: $person1: ${person1.hashCode()}")

	println(person1.copy())
	println(person1.copy(name = "bye world"))

	//Enum, Sealed
	val season: Season = Season.Autumn
	val errorCode: ErrorCode = ErrorCode.NetworkError

	for (s in Season.entries) {
		println("${s.name} has ordinal ${s.ordinal}")
	}

	println("Next season is ${season.next()}")
	println("$errorCode")

	var error: Error = Error.NetworkError(23)
	error = RuntimeError()

	//Generics
	val env: Envelope<Person> = Envelope(Person(), null)
	val names: List<String> = listOf("Kevin", "Terry")
	val namesEnv: Envelope<List<String>> = Envelope(names, null)
	val sqlEnvelope = SqlEnvelope(100, names)


}

fun clickSomething(clickable: Clickable) {
	clickable.click()
}


//EXTENSIVE FUNCTION
fun String.replaceMultipleWhitespace() : String {
	val regex = Regex("\\s+")
	return regex.replace(this, " ")
}

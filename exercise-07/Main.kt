// Ejercicio 7. Agenda de contactos
// Conceptos: clases, mutableListOf, add/remove, búsqueda con firstOrNull, null safety.

class Contact(val name: String, val phone: String, val email: String) {
    override fun toString(): String = "$name | $phone | $email"
}

fun addContact(contacts: MutableList<Contact>, contact: Contact) {
    contacts.add(contact)
    println("Contacto agregado: ${contact.name}")
}

fun listContacts(contacts: List<Contact>) {
    if (contacts.isEmpty()) {
        println("La agenda está vacía")
        return
    }
    println("--- Agenda (${contacts.size} contactos) ---")
    for ((index, contact) in contacts.withIndex()) {
        println("${index + 1}. $contact")
    }
}

fun searchContact(contacts: List<Contact>, name: String): Contact? =
    contacts.firstOrNull { it.name.equals(name, ignoreCase = true) }

fun removeContact(contacts: MutableList<Contact>, name: String) {
    val contact = searchContact(contacts, name)
    if (contact == null) {
        println("El contacto '$name' no existe")
    } else {
        contacts.remove(contact)
        println("Contacto eliminado: ${contact.name}")
    }
}

fun main() {
    val contacts = mutableListOf(
        Contact("Ana Gómez", "3001112233", "ana@mail.com"),
        Contact("Carlos Ruiz", "3012223344", "carlos@mail.com"),
        Contact("María López", "3023334455", "maria@mail.com"),
        Contact("Pedro Díaz", "3034445566", "pedro@mail.com"),
        Contact("Laura Torres", "3045556677", "laura@mail.com")
    )

    listContacts(contacts)

    println("\nAgregar:")
    addContact(contacts, Contact("Juan Pérez", "3056667788", "juan@mail.com"))

    println("\nBuscar:")
    for (name in listOf("maría lópez", "Sofía")) {
        val found = searchContact(contacts, name)
        if (found != null) println("Encontrado: $found") else println("El contacto '$name' no existe")
    }

    println("\nEliminar:")
    removeContact(contacts, "Pedro Díaz")
    removeContact(contacts, "Pedro Díaz")   // ya no existe

    println()
    listContacts(contacts)
}

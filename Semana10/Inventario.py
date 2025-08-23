# Clase Inventario: manejará una lista de producto
import os

class Inventario:
    def __init__(self, archivo="inventario.txt"):
        self.archivo = archivo
        self.productos = {}  # Diccionario para almacenar productos: {nombre: cantidad}
        self.cargar_inventario()

    def cargar_inventario(self):
        """Carga los productos desde el archivo al iniciar el programa."""
        try:
            if os.path.exists(self.archivo):
                with open(self.archivo, "r") as f:
                    for linea in f:
                        nombre, cantidad = linea.strip().split(",")
                        self.productos[nombre] = int(cantidad)
                print("Inventario cargado exitosamente desde el archivo.")
            else:
                # Si no existe el archivo, se crea automáticamente
                open(self.archivo, "w").close()
                print("Archivo de inventario creado.")
        except FileNotFoundError:
            print("Error: No se encontró el archivo de inventario.")
        except PermissionError:
            print("Error: No tienes permisos para leer el archivo de inventario.")
        except Exception as e:
            print(f"Error al cargar inventario: {e}")

    def guardar_inventario(self):
        """Guarda los productos en el archivo."""
        try:
            with open(self.archivo, "w") as f:
                for nombre, cantidad in self.productos.items():
                    f.write(f"{nombre},{cantidad}\n")
        except PermissionError:
            print("Error: No tienes permisos para escribir en el archivo de inventario.")
        except Exception as e:
            print(f"Error al guardar inventario: {e}")

    def agregar_producto(self, nombre, cantidad):
        """Agrega un producto o actualiza la cantidad si ya existe."""
        if nombre in self.productos:
            self.productos[nombre] += cantidad
        else:
            self.productos[nombre] = cantidad
        self.guardar_inventario()
        print(f"Producto '{nombre}' agregado/actualizado con éxito.")

    def eliminar_producto(self, nombre):
        """Elimina un producto del inventario."""
        if nombre in self.productos:
            del self.productos[nombre]
            self.guardar_inventario()
            print(f"Producto '{nombre}' eliminado exitosamente.")
        else:
            print(f"Producto '{nombre}' no existe en el inventario.")

    def mostrar_inventario(self):
        """Muestra todos los productos en inventario."""
        if not self.productos:
            print("El inventario está vacío.")
        else:
            print("Inventario actual:")
            for nombre, cantidad in self.productos.items():
                print(f"- {nombre}: {cantidad}")

# --------------------- INTERFAZ DE USUARIO ---------------------
def menu():
    inventario = Inventario()
    while True:
        print("\n--- Sistema de Gestión de Inventario ---")
        print("1. Mostrar inventario")
        print("2. Agregar producto")
        print("3. Eliminar producto")
        print("4. Salir")
        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            inventario.mostrar_inventario()
        elif opcion == "2":
            nombre = input("Nombre del producto: ")
            cantidad = int(input("Cantidad: "))
            inventario.agregar_producto(nombre, cantidad)
        elif opcion == "3":
            nombre = input("Nombre del producto a eliminar: ")
            inventario.eliminar_producto(nombre)
        elif opcion == "4":
            print("Saliendo del sistema...")
            break
        else:
            print("Opción no válida, intenta nuevamente.")

if __name__ == "__main__":
    menu()

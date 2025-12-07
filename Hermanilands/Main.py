import random

# Base de datos de jugadores (media global, nombre, posición)
JUGADORES = [
    # Porteros
    {"nombre": "Thibaut Courtois", "posicion": "POR", "media": 89},
    {"nombre": "Alisson Becker", "posicion": "POR", "media": 89},
    {"nombre": "Ederson", "posicion": "POR", "media": 88},
    {"nombre": "Marc-André ter Stegen", "posicion": "POR", "media": 87},
    
    # Defensas
    {"nombre": "Virgil van Dijk", "posicion": "DFC", "media": 90},
    {"nombre": "Ruben Dias", "posicion": "DFC", "media": 88},
    {"nombre": "Marquinhos", "posicion": "DFC", "media": 87},
    {"nombre": "Antonio Rudiger", "posicion": "DFC", "media": 86},
    {"nombre": "Eder Militao", "posicion": "DFC", "media": 85},
    {"nombre": "Kim Min-jae", "posicion": "DFC", "media": 85},
    {"nombre": "Trent Alexander-Arnold", "posicion": "LD", "media": 87},
    {"nombre": "Achraf Hakimi", "posicion": "LD", "media": 86},
    {"nombre": "Kyle Walker", "posicion": "LD", "media": 84},
    {"nombre": "Andrew Robertson", "posicion": "LI", "media": 86},
    {"nombre": "Theo Hernandez", "posicion": "LI", "media": 85},
    {"nombre": "Alphonso Davies", "posicion": "LI", "media": 84},
    
    # Mediocampistas
    {"nombre": "Kevin De Bruyne", "posicion": "MC", "media": 91},
    {"nombre": "Jude Bellingham", "posicion": "MC", "media": 90},
    {"nombre": "Rodri", "posicion": "MCD", "media": 90},
    {"nombre": "Luka Modric", "posicion": "MC", "media": 88},
    {"nombre": "Casemiro", "posicion": "MCD", "media": 87},
    {"nombre": "Bruno Fernandes", "posicion": "MCO", "media": 87},
    {"nombre": "Frenkie de Jong", "posicion": "MC", "media": 86},
    {"nombre": "Federico Valverde", "posicion": "MC", "media": 86},
    {"nombre": "Bernardo Silva", "posicion": "MC", "media": 86},
    {"nombre": "Pedri", "posicion": "MC", "media": 85},
    
    # Extremos
    {"nombre": "Lionel Messi", "posicion": "ED", "media": 91},
    {"nombre": "Vinicius Jr", "posicion": "EI", "media": 90},
    {"nombre": "Mohamed Salah", "posicion": "ED", "media": 89},
    {"nombre": "Kylian Mbappé", "posicion": "EI", "media": 91},
    {"nombre": "Bukayo Saka", "posicion": "ED", "media": 87},
    {"nombre": "Phil Foden", "posicion": "EI", "media": 87},
    {"nombre": "Leroy Sané", "posicion": "EI", "media": 85},
    {"nombre": "Rafael Leão", "posicion": "EI", "media": 85},
    
    # Delanteros
    {"nombre": "Erling Haaland", "posicion": "DC", "media": 91},
    {"nombre": "Harry Kane", "posicion": "DC", "media": 90},
    {"nombre": "Robert Lewandowski", "posicion": "DC", "media": 89},
    {"nombre": "Victor Osimhen", "posicion": "DC", "media": 88},
    {"nombre": "Lautaro Martinez", "posicion": "DC", "media": 87},
    {"nombre": "Darwin Núñez", "posicion": "DC", "media": 84},
]

FORMACIONES = {
    "4-3-3": {"POR": 1, "DEF": 4, "MC": 3, "DEL": 3},
    "4-4-2": {"POR": 1, "DEF": 4, "MC": 4, "DEL": 2},
}

def obtener_categoria_posicion(pos):
    """Convierte posiciones específicas en categorías generales"""
    if pos == "POR":
        return "POR"
    elif pos in ["DFC", "LD", "LI"]:
        return "DEF"
    elif pos in ["MC", "MCD", "MCO"]:
        return "MC"
    elif pos in ["EI", "ED", "DC"]:
        return "DEL"
    return None

def mostrar_jugadores_disponibles(disponibles, categoria=None):
    """Muestra los jugadores disponibles, opcionalmente filtrados por categoría"""
    jugadores_filtrados = []
    
    for idx, j in enumerate(disponibles):
        cat = obtener_categoria_posicion(j["posicion"])
        if categoria is None or cat == categoria:
            jugadores_filtrados.append((idx, j))
    
    if not jugadores_filtrados:
        print(f"No hay jugadores disponibles en la categoría {categoria}")
        return []
    
    print("\nJugadores disponibles:")
    for idx, j in jugadores_filtrados:
        print(f"{idx}. {j['nombre']} - {j['posicion']} (Media: {j['media']})")
    
    return jugadores_filtrados

def elegir_jugador(jugador_num, disponibles, categoria, plantilla, formacion):
    """Permite a un jugador elegir un futbolista"""
    requerido = formacion[categoria]
    actuales = sum(1 for j in plantilla if obtener_categoria_posicion(j["posicion"]) == categoria)
    
    if actuales >= requerido:
        print(f"Ya tienes todos los {categoria} necesarios ({requerido})")
        return None
    
    print(f"\n--- Turno del Jugador {jugador_num} ---")
    print(f"Categoría: {categoria} (Tienes {actuales}/{requerido})")
    
    jugadores_filtrados = mostrar_jugadores_disponibles(disponibles, categoria)
    
    if not jugadores_filtrados:
        return None
    
    while True:
        try:
            eleccion = int(input("Elige el número del jugador: "))
            jugador_elegido = disponibles[eleccion]
            
            # Verificar que sea de la categoría correcta
            if obtener_categoria_posicion(jugador_elegido["posicion"]) == categoria:
                return jugador_elegido
            else:
                print("Ese jugador no pertenece a la categoría actual.")
        except (ValueError, IndexError):
            print("Opción inválida. Intenta de nuevo.")

def calcular_media_equipo(plantilla):
    """Calcula la media global del equipo"""
    if len(plantilla) == 0:
        return 0
    return sum(j["media"] for j in plantilla) / len(plantilla)

def mostrar_plantilla(jugador_num, plantilla, formacion):
    """Muestra la plantilla actual de un jugador"""
    print(f"\n=== Plantilla del Jugador {jugador_num} ===")
    print(f"Formación: {formacion}")
    
    categorias = ["POR", "DEF", "MC", "DEL"]
    for cat in categorias:
        jugadores_cat = [j for j in plantilla if obtener_categoria_posicion(j["posicion"]) == cat]
        print(f"\n{cat}:")
        for j in jugadores_cat:
            print(f"  - {j['nombre']} ({j['posicion']}) - Media: {j['media']}")
    
    media = calcular_media_equipo(plantilla)
    print(f"\nMedia del equipo: {media:.2f}")

def main():
    print("=" * 50)
    print("JUEGO DE DRAFT DE FUTBOLISTAS")
    print("=" * 50)
    
    # Selección de formaciones
    print("\nFormaciones disponibles:")
    for nombre, detalle in FORMACIONES.items():
        print(f"- {nombre}: {detalle['POR']} POR, {detalle['DEF']} DEF, {detalle['MC']} MC, {detalle['DEL']} DEL")
    
    formacion1 = input("\nJugador 1, elige tu formación (4-3-3 o 4-4-2): ").strip()
    while formacion1 not in FORMACIONES:
        formacion1 = input("Formación inválida. Elige 4-3-3 o 4-4-2: ").strip()
    
    formacion2 = input("Jugador 2, elige tu formación (4-3-3 o 4-4-2): ").strip()
    while formacion2 not in FORMACIONES:
        formacion2 = input("Formación inválida. Elige 4-3-3 o 4-4-2: ").strip()
    
    plantilla1 = []
    plantilla2 = []
    disponibles = JUGADORES.copy()
    
    form1 = FORMACIONES[formacion1]
    form2 = FORMACIONES[formacion2]
    
    # Crear orden de draft por categorías
    categorias = ["POR", "DEF", "MC", "DEL"]
    turnos = []
    
    for cat in categorias:
        max_picks = max(form1[cat], form2[cat])
        for pick in range(max_picks):
            if pick < form1[cat]:
                turnos.append((1, cat))
            if pick < form2[cat]:
                turnos.append((2, cat))
    
    # Mezclar los turnos aleatoriamente
    random.shuffle(turnos)
    
    print(f"\nSe realizarán {len(turnos)} selecciones en total.")
    input("Presiona Enter para comenzar el draft...")
    
    # Draft
    for turno_num, (jugador, categoria) in enumerate(turnos, 1):
        print(f"\n{'='*50}")
        print(f"TURNO {turno_num}/{len(turnos)}")
        print(f"{'='*50}")
        
        if jugador == 1:
            jugador_elegido = elegir_jugador(1, disponibles, categoria, plantilla1, form1)
            if jugador_elegido:
                plantilla1.append(jugador_elegido)
                disponibles.remove(jugador_elegido)
                print(f"\n✓ Jugador 1 seleccionó a {jugador_elegido['nombre']}")
        else:
            jugador_elegido = elegir_jugador(2, disponibles, categoria, plantilla2, form2)
            if jugador_elegido:
                plantilla2.append(jugador_elegido)
                disponibles.remove(jugador_elegido)
                print(f"\n✓ Jugador 2 seleccionó a {jugador_elegido['nombre']}")
    
    # Mostrar resultados finales
    print("\n" + "="*50)
    print("RESULTADOS FINALES")
    print("="*50)
    
    mostrar_plantilla(1, plantilla1, formacion1)
    mostrar_plantilla(2, plantilla2, formacion2)
    
    media1 = calcular_media_equipo(plantilla1)
    media2 = calcular_media_equipo(plantilla2)
    
    print("\n" + "="*50)
    print("GANADOR")
    print("="*50)
    
    if media1 > media2:
        print(f"🏆 ¡JUGADOR 1 GANA! (Media: {media1:.2f} vs {media2:.2f})")
    elif media2 > media1:
        print(f"🏆 ¡JUGADOR 2 GANA! (Media: {media2:.2f} vs {media1:.2f})")
    else:
        print(f"🤝 ¡EMPATE! (Ambos con media: {media1:.2f})")

if __name__ == "__main__":
    main()
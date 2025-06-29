use std::io;
use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    let mut vetor = [0; 20];
    for i in 0..vetor.len() {
        vetor[i] = simple_random() % 101;
    }
    println!("O vetor original é {:?}.", vetor);
    vetor.sort();
    println!("O vetor ordenado é {:?}.", vetor);

    bin_search(
        vetor,
        0,
        vetor.len(),
        input_i32("Insira o valor a ser procurado: "),
    )
}

fn bin_search(vet: [i32; 20], min: usize, max: usize, num: i32) {
    if max > min {
        let mid = ((max as i32 - min as i32) / 2) as usize + min;
        if vet[mid] > num {
            bin_search(vet, min, mid, num);
        } else if vet[mid] < num {
            bin_search(vet, mid, max, num);
        } else {
            println!("Valor encontrado na casa {}!", mid + 1);
        }
    } else {
        println!("Valor não encontrado!");
    }
}

fn simple_random() -> i32 {
    let seed = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .unwrap()
        .as_nanos() as i32; // Convert time to a u32 seed

    // A very basic pseudo-random generator (LCG)
    let mut rng = seed;
    rng = rng.wrapping_mul(1664525).wrapping_add(1013904223);
    rng
}

fn input_i32(texto: &str) -> i32 {
    let int: i32;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        int = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        return int;
    }
}

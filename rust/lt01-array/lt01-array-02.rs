use std::time::{SystemTime, UNIX_EPOCH};
use std::vec;

fn main() {
    let mut vector: Vec<u32> = vec![];
    let mut soma = 0;
    for i in 0..100 {
        let aux = simple_random() % 100;
        vector.push(aux);
        soma += aux;
    }
    vector.sort();
    println!("O valor do maior número e {}.", vector[vector.len() - 1]);
    println!("O valor do menor número e {}.", vector[0]);
    println!("O valor da média é {:.2}.", soma / (vector.len() as u32));
}

fn simple_random() -> u32 {
    let seed = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .unwrap()
        .as_nanos() as u32; // Convert time to a u32 seed

    // A very basic pseudo-random generator (LCG)
    let mut rng = seed;
    rng = rng.wrapping_mul(1664525).wrapping_add(1013904223);
    rng
}

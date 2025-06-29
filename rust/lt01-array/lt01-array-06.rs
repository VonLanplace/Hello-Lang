use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    let mut vetor = [0; 20];
    for i in 0..vetor.len() {
        vetor[i] = simple_random() % 101;
    }
    println!("O vetor original é {:?}.", vetor);
    vetor.sort();
    println!("O vetor ordenado é {:?}.", vetor);
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

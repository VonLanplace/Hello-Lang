use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    let mut vetor = vec![];
    for _i in 0..20 {
        vetor.push(simple_random() % 100);
    }
    println!("Os vetor é {:?}.", vetor);
    println!("Os valores são: ");
    let size = vetor.len() - 1;
    for i in 0..vetor.len() {
        let j = (size as i32 - i as i32) as usize;
        let aux = vetor[i] - vetor[j];

        if vetor[j] >= 0 {
            println!("{} -{} = {}", vetor[i], vetor[j], aux);
        } else {
            println!("{} {} = {}", vetor[i], vetor[j], aux);
        }
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

use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    let mut matriz = [[0; 4]; 4];
    for i in 0..matriz.len() {
        for j in 0..matriz[0].len() {
            if i == j {
                matriz[i][j] = 2_i32.pow((i + j) as u32);
            } else {
                matriz[i][j] = simple_random();
            }
        }
    }
    for linha in &matriz {
        println!("{:?}", linha);
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
    rng % 65
}

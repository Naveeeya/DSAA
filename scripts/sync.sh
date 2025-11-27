#!/bin/bash

echo "🚀 Starting synchronization..."

# 1. Pull latest changes from GitHub first (to avoid conflicts)
echo "⬇️  Pulling latest changes..."
git pull origin main --no-rebase

# 2. Add all local changes
git add .

# 3. Check if there are changes to commit
if git diff-index --quiet HEAD --; then
    echo "✅ No local changes to save."
else
    # 4. Commit with timestamp
    current_date=$(date "+%Y-%m-%d %H:%M:%S")
    git commit -m "DSA Progress: $current_date"

    # 5. Push to GitHub
    echo "⬆️  Pushing to GitHub..."
    git push origin main
    echo "✅ Sync complete!"
fi
#!/bin/bash

# 1. Add all changes (including new Java files in 'codes')
git add .

# 2. Get current date for the commit message
current_date=$(date "+%Y-%m-%d %H:%M:%S")

# 3. Commit
git commit -m "DSA Progress: $current_date"

# 4. Push to GitHub
git push origin main

echo "✅ DSAA repo updated successfully!"
